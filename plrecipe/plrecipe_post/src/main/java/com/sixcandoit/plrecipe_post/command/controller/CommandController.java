package com.sixcandoit.plrecipe_post.command.controller;

import com.sixcandoit.plrecipe_post.command.aggregate.Post;
import com.sixcandoit.plrecipe_post.command.aggregate.PostHashtag;
import com.sixcandoit.plrecipe_post.command.dto.HashtagDTO;
import com.sixcandoit.plrecipe_post.command.dto.PostDTO;
import com.sixcandoit.plrecipe_post.command.vo.RequestPostHashtag;
import com.sixcandoit.plrecipe_post.command.aggregate.PostAndHashtag;
import com.sixcandoit.plrecipe_post.command.service.CommandHashtagService;
import com.sixcandoit.plrecipe_post.command.service.CommandPostHashtagService;
import com.sixcandoit.plrecipe_post.command.service.CommandPostService;
import com.sixcandoit.plrecipe_post.command.vo.RequestHashtag;
import com.sixcandoit.plrecipe_post.command.vo.ResponseHashtag;
import com.sixcandoit.plrecipe_post.command.vo.RequestPost;
import com.sixcandoit.plrecipe_post.command.vo.ResponsePost;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/post")
@RequestMapping("/")
public class CommandController {
    private CommandHashtagService commandHashtagService;
    private CommandPostService commandPostService;
    private ModelMapper modelMapper;
    private CommandPostHashtagService commandPostHashtagService;

    @Autowired
    public CommandController(CommandHashtagService commandHashtagService, CommandPostService commandPostService, ModelMapper modelMapper, CommandPostHashtagService commandPostHashtagService) {
        this.commandHashtagService = commandHashtagService;
        this.commandPostService = commandPostService;
        this.modelMapper = modelMapper;
        this.commandPostHashtagService = commandPostHashtagService;
    }


    /* 해시태그 생성 */
    @PostMapping("/regist/hashtag")
    private ResponseEntity<ResponseHashtag> registHashTag(@RequestBody RequestHashtag hashtag) {
        HashtagDTO hashtagDTO = modelMapper.map(hashtag, HashtagDTO.class);

        commandHashtagService.registHashtag(hashtagDTO);

        ResponseHashtag responseHashtag = modelMapper.map(hashtagDTO, ResponseHashtag.class);

        return ResponseEntity.status(HttpStatus.CREATED).body(responseHashtag);
    }

    /* 게시글 생성(해시태그 중간 객체도 같이 insert) */
    @PostMapping("/regist_both")
    private ResponseEntity<?> registPostAndHashtag(@RequestBody RequestPostHashtag test) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        PostAndHashtag postAndHashtag = modelMapper.map(test, PostAndHashtag.class);
        commandPostService.registPostAndHashtag(postAndHashtag);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    /* 게시글 수정 */
    @PatchMapping("/modify/{postId}")
    public ResponseEntity<Post> modifyPost (@RequestBody RequestPost requestPost, @PathVariable int postId ) {
        return ResponseEntity.ok(commandPostService.modifyPost(postId, requestPost));
    }

    /* 게시글 삭제(게시글 삭제일 update) */
    @PatchMapping("/delete/{postId}")
    public ResponseEntity<Post> deletePost (@RequestBody RequestPost requestPost, @PathVariable int postId) {
        return ResponseEntity.ok(commandPostService.modifyPostDeleteDate(postId, requestPost));
    }

    /* 해시태그 삭제 */
    @GetMapping("/hashtag/delete")
    public void deletePage() {}

    /* 해시태그 중간객체 삭제 */
    @DeleteMapping("/hashtag/delete/{postHashtagId}")
    public ResponseEntity<PostHashtag> deletePostHashTag(@PathVariable int postHashtagId) {
        commandPostHashtagService.deletePost(postHashtagId);

        return ResponseEntity.ok().build();
    }

    /* 게시글 좋아요 등록 */
    @PostMapping("/like")
    private ResponseEntity<ResponsePost> postLike(@RequestBody RequestPost post) {
        PostDTO postDTO = modelMapper.map(post, PostDTO.class);

        commandPostService.postLike(postDTO);

        ResponsePost responsePost = modelMapper.map(postDTO, ResponsePost.class);

        return ResponseEntity.status(HttpStatus.CREATED).body(responsePost);
    }

    /*  */
    @PostMapping("/regist")
    private ResponseEntity<ResponsePost> registPost(@RequestBody RequestPost post) {
        PostDTO postDTO = modelMapper.map(post, PostDTO.class);

        commandPostService.registPost(postDTO);

        ResponsePost responsePost = modelMapper.map(postDTO, ResponsePost.class);

        return ResponseEntity.status(HttpStatus.CREATED).body(responsePost);
    }
}