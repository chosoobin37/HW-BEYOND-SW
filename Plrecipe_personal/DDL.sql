CREATE TABLE `member_info` (
   `member_email`   VARCHAR(127)   NOT NULL,
   `password`   VARCHAR(31)   NOT NULL,
   `member_name`   VARCHAR(63)   NOT NULL,
   `member_nickname`   VARCHAR(31)   NOT NULL,
   `member_number`   VARCHAR(15)   NOT NULL,
   `join_date`   DATETIME   NOT NULL,
   `withdrawal_date`   DATETIME   NULL,
   `member_status`   ENUM('member', 'admin')   NOT NULL,
   `member_grade`  BOOLEAN NOT NULL    DEFAULT FALSE 
);

CREATE TABLE `post` (
   `post_id`   INT   NOT NULL AUTO_INCREMENT PRIMARY KEY,
   `post_title`   VARCHAR(255)   NOT NULL,
   `post_content`   VARCHAR(255)   NOT NULL,
   `post_date`   DATETIME   NOT NULL,
   `post_delete_date`   DATETIME   NULL,
   `member_email`   VARCHAR(127)   NOT NULL,
   `course_id`   INT   NOT NULL,
   `is_post_public`   BOOLEAN   NOT NULL,
   `member_count`   ENUM('1', '2', '3')   NOT NULL
);

CREATE TABLE `plecipe_group` (
   `group_id`   INT   NOT NULL AUTO_INCREMENT PRIMARY KEY,
   `group_name`   VARCHAR(255)   NOT NULL,
   `is_group_public`   BOOLEAN   NOT NULL,
   `group_create_date`   VARCHAR(255)   NOT NULL,
   `group_comment`   VARCHAR(255)   NULL
);

CREATE TABLE `follow_info` (
   `follow_id`   INT   NOT NULL AUTO_INCREMENT PRIMARY KEY,
   `user_follow`   VARCHAR(127)   NOT NULL,
   `user_follower`   VARCHAR(127)   NOT NULL
);

CREATE TABLE `place_star` (
   `star_id`   INT   NOT NULL AUTO_INCREMENT PRIMARY KEY,
   `star_point`   INT   NOT NULL,
   `star_comment`   VARCHAR(255)   NULL,
   `place_id`   INT   NOT NULL,
   `member_email`   VARCHAR(127)   NOT NULL
);

CREATE TABLE `place` (
   `place_id`   INT   NOT NULL AUTO_INCREMENT PRIMARY KEY,
   `place_name`   VARCHAR(127)   NOT NULL,
   `place_location`   VARCHAR(255)   NOT NULL,
   `place_phone_num`   VARCHAR(15)   NULL,
   `place_category_id`   INT   NOT NULL,
   `member_email`   VARCHAR(127)   NOT NULL
);

CREATE TABLE `Image` (
   `image_id`   INT   NOT NULL AUTO_INCREMENT PRIMARY KEY,
   `image_location`   VARCHAR(255)   NOT NULL,
   `image_name`   VARCHAR(255)   NOT NULL,
   `post_id`   INT   NOT NULL,
   `member_email`   VARCHAR(255)   NOT NULL,
   `group_id`   INT   NOT NULL,
   `image_rename`   VARCHAR(255)   NULL
);

CREATE TABLE `course` (
   `course_id`   INT   NOT NULL AUTO_INCREMENT PRIMARY KEY,
   `course_name`   VARCHAR(127)   NULL,
   `member_email`   VARCHAR(127)   NOT NULL
);

CREATE TABLE `group_member` (
   `group_member_id`   INT   NOT NULL AUTO_INCREMENT PRIMARY KEY,
   `groupmember_sequence`   INT   NOT NULL,
   `invite_state_id`   ENUM('accept', 'waiting', 'deny')   NOT NULL,
   `group_id`   INT   NOT NULL,
   `member_email`   VARCHAR(127)   NOT NULL
);

CREATE TABLE `course_place` (
   `place_course_id`   INT   NOT NULL AUTO_INCREMENT PRIMARY KEY,
   `place_id`   INT   NOT NULL,
   `course_id`   INT   NOT NULL,
   `place_sequence`   INT   NOT NULL
);

CREATE TABLE `place_category` (
   `place_category_id`   INT   NOT NULL AUTO_INCREMENT PRIMARY KEY,
   `place_category_name`   VARCHAR(63)   NOT NULL
);

CREATE TABLE `Hashtag` (
   `hashtag_id`   INT   NOT NULL AUTO_INCREMENT PRIMARY KEY,
   `hashtag_title`   VARCHAR(255)   NOT NULL
);

CREATE TABLE `post_hashtag` (
   `post_hashtag_id`   INT   NOT NULL AUTO_INCREMENT PRIMARY KEY,
   `hashtag_id`   INT   NOT NULL,
   `post_id`   INT   NOT NULL
);

CREATE TABLE `post_like` (
   `post_like_id`   INT   NOT NULL AUTO_INCREMENT PRIMARY KEY,
   `member_email`   VARCHAR(127)   NOT NULL,
   `post_id`   INT   NOT NULL
);

ALTER TABLE `member_info` ADD CONSTRAINT `PK_MEMBER_INFO` PRIMARY KEY (
   `member_email`
);


ALTER TABLE `post` ADD CONSTRAINT `FK_member_info_TO_post_1` FOREIGN KEY (
   `member_email`
)
REFERENCES `member_info` (
   `member_email`
);

ALTER TABLE `post` ADD CONSTRAINT `FK_course_TO_post_1` FOREIGN KEY (
   `course_id`
)
REFERENCES `course` (
   `course_id`
);

ALTER TABLE `follow_info` ADD CONSTRAINT `FK_member_info_TO_follow_info_1` FOREIGN KEY (
   `user_follow`
)
REFERENCES `member_info` (
   `member_email`
);

ALTER TABLE `follow_info` ADD CONSTRAINT `FK_member_info_TO_follow_info_2` FOREIGN KEY (
   `user_follower`
)
REFERENCES `member_info` (
   `member_email`
);

ALTER TABLE `place_star` ADD CONSTRAINT `FK_place_TO_place_star_1` FOREIGN KEY (
   `place_id`
)
REFERENCES `place` (
   `place_id`
);

ALTER TABLE `place_star` ADD CONSTRAINT `FK_member_info_TO_place_star_1` FOREIGN KEY (
   `member_email`
)
REFERENCES `member_info` (
   `member_email`
);

ALTER TABLE `place` ADD CONSTRAINT `FK_place_category_TO_place_1` FOREIGN KEY (
   `place_category_id`
)
REFERENCES `place_category` (
   `place_category_id`
);

ALTER TABLE `place` ADD CONSTRAINT `FK_member_info_TO_place_1` FOREIGN KEY (
   `member_email`
)
REFERENCES `member_info` (
   `member_email`
);

ALTER TABLE `Image` ADD CONSTRAINT `FK_post_TO_Image_1` FOREIGN KEY (
   `post_id`
)
REFERENCES `post` (
   `post_id`
);

ALTER TABLE `Image` ADD CONSTRAINT `FK_member_info_TO_Image_1` FOREIGN KEY (
   `member_email`
)
REFERENCES `member_info` (
   `member_email`
);

ALTER TABLE `Image` ADD CONSTRAINT `FK_plecipe_group_TO_Image_1` FOREIGN KEY (
   `group_id`
)
REFERENCES `plecipe_group` (
   `group_id`
);

ALTER TABLE `course` ADD CONSTRAINT `FK_member_info_TO_course_1` FOREIGN KEY (
   `member_email`
)
REFERENCES `member_info` (
   `member_email`
);

ALTER TABLE `group_member` ADD CONSTRAINT `FK_plecipe_group_TO_group_member_1` FOREIGN KEY (
   `group_id`
)
REFERENCES `plecipe_group` (
   `group_id`
);

ALTER TABLE `group_member` ADD CONSTRAINT `FK_member_info_TO_group_member_1` FOREIGN KEY (
   `member_email`
)
REFERENCES `member_info` (
   `member_email`
);

ALTER TABLE `course_place` ADD CONSTRAINT `FK_place_TO_course_place_1` FOREIGN KEY (
   `place_id`
)
REFERENCES `place` (
   `place_id`
);

ALTER TABLE `course_place` ADD CONSTRAINT `FK_course_TO_course_place_1` FOREIGN KEY (
   `course_id`
)
REFERENCES `course` (
   `course_id`
);

ALTER TABLE `post_hashtag` ADD CONSTRAINT `FK_Hashtag_TO_post_hashtag_1` FOREIGN KEY (
   `hashtag_id`
)
REFERENCES `Hashtag` (
   `hashtag_id`
);

ALTER TABLE `post_hashtag` ADD CONSTRAINT `FK_post_TO_post_hashtag_1` FOREIGN KEY (
   `post_id`
)
REFERENCES `post` (
   `post_id`
);

ALTER TABLE `post_like` ADD CONSTRAINT `FK_member_info_TO_post_like_1` FOREIGN KEY (
   `member_email`
)
REFERENCES `member_info` (
   `member_email`
);

ALTER TABLE `post_like` ADD CONSTRAINT `FK_post_TO_post_like_1` FOREIGN KEY (
   `post_id`
)
REFERENCES `post` (
   `post_id`
);