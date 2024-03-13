package com.sixcandoit.plrecipe_member.command.controller;

import com.sixcandoit.plrecipe_member.command.vo.RequestFollow;
import com.sixcandoit.plrecipe_member.command.vo.ResponseFollow;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.sixcandoit.plrecipe_member.command.dto.FollowDTO;
import com.sixcandoit.plrecipe_member.command.service.FollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/plrecipe-follow")
public class FollowController {

    private final FollowService followService;
    private final ModelMapper modelMapper;

    @Autowired
    public FollowController(FollowService followService, ModelMapper modelMapper) {
        this.followService = followService;
        this.modelMapper = modelMapper;
    }

    // 팔로우 하기
    @PostMapping("/new")
    private ResponseEntity<ResponseFollow> followMember(@RequestBody RequestFollow follow) {

        FollowDTO followDTO = modelMapper.map(follow, FollowDTO.class);
        followService.followMember(followDTO);
        ResponseFollow responseFollow = modelMapper.map((followDTO), ResponseFollow.class);

        return ResponseEntity.status(HttpStatus.CREATED).body(responseFollow);
    }

    // 팔로우 취소하기
    @GetMapping("/unfollow")
    public void cancelFollow() {    }

    // 팔로우 취소하기
    @DeleteMapping("/unfollow/{followId}")
    public ResponseEntity<ResponseFollow> cancelFollow(@PathVariable int followId) {
        followService.cancelFollow(followId);
        return ResponseEntity.ok().build();
    }

}
