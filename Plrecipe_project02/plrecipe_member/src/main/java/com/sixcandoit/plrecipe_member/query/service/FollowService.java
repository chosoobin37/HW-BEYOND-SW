package com.sixcandoit.plrecipe_member.query.service;

import com.sixcandoit.plrecipe_member.command.dto.FollowDTO;

import java.util.List;

public interface FollowService {
    List<FollowDTO> selectMemberWhoFollowsMe(int userFollow);
    List<FollowDTO> selectMemberWhoIFollow(int userFollower);
    List<FollowDTO> selectAllFollows();
    void followMember(FollowDTO followDTO);
    void cancelFollow(int followId);
    FollowDTO selectFollowById(int followId);
}
