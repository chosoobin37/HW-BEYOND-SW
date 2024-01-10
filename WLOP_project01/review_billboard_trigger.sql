DELIMITER //
CREATE TRIGGER after_like
BEFORE INSERT ON Likes
FOR EACH ROW
BEGIN
  DECLARE content_exists INT;

  -- 중복 투표 확인
  SELECT COUNT(*) INTO content_exists
  FROM Likes
  WHERE content_type = NEW.content_type
    AND ((review_code = NEW.review_code AND NEW.review_code IS NOT NULL) OR (freeboard = NEW.freeboard AND NEW.freeboard IS NOT NULL))
    AND member_id = NEW.member_id;

  -- 중복이 있다면 중복 방지를 위해 예외 발생
  IF content_exists > 0 THEN
    SIGNAL SQLSTATE '45000'
    SET MESSAGE_TEXT = 'Duplicate vote is not allowed.';
  ELSE
    -- 중복이 없다면 추천 누적 수 증가
    IF NEW.content_type = 'Review' THEN
      UPDATE Review
      SET review_likes = review_likes + 1
      WHERE review_code = NEW.review_code;
    ELSE
      UPDATE Billboard
      SET board_likes = board_likes + 1
      WHERE freeboard = NEW.freeboard;
    END IF;
  END IF;
END;
//
DELIMITER ;


INSERT INTO Likes (content_type, review_code,member_id) VALUES ('Review',1, 'parkjungman');
INSERT INTO Likes (content_type, review_code,member_id) VALUES ('Review',1, 'parkjungman');
INSERT INTO Likes (content_type, review_code,member_id) VALUES ('Review',1, 'yunjaeeun');

INSERT INTO Likes (content_type, freeboard,member_id) VALUES ('Billboard',1, 'parkjungman');
INSERT INTO Likes (content_type, freeboard,member_id) VALUES ('Billboard',1, 'parkjungman');
INSERT INTO Likes (content_type, freeboard,member_id) VALUES ('Billboard',1, 'yunjaeeun');

SELECT * FROM Review WHERE review_code = 1;
SELECT * FROM Billboard WHERE freeboard = 1;