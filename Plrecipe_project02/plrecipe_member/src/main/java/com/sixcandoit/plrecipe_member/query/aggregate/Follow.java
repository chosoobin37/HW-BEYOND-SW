package com.sixcandoit.plrecipe_member.query.aggregate;

public class Follow {

    private int followId;
    private int userFollow;
    private int userFollower;

    public Follow() {
    }

    public Follow(int followId, int userFollow, int userFollower) {
        this.followId = followId;
        this.userFollow = userFollow;
        this.userFollower = userFollower;
    }

    public int getFollowId() {
        return followId;
    }

    public void setFollowId(int followId) {
        this.followId = followId;
    }

    public int getUserFollow() {
        return userFollow;
    }

    public void setUserFollow(int userFollow) {
        this.userFollow = userFollow;
    }

    public int getUserFollower() {
        return userFollower;
    }

    public void setUserFollower(int userFollower) {
        this.userFollower = userFollower;
    }

    @Override
    public String toString() {
        return "Follow{" +
                "followId=" + followId +
                ", userFollow=" + userFollow +
                ", userFollower=" + userFollower +
                '}';
    }
}
