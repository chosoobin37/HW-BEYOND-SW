package aggregate;

public class Board {
    private int boardNo;        // 게시글 번호
    private String id;          // 작성자
    private String title;       // 글 제목
    private String content;     // 작성내용
    private String date;        // 작성날짜

    private CategoryType categoryType; // 카테고리

    public Board(int boardNo, String id, String title, String content, String date, CategoryType categoryType) {
        this.boardNo = boardNo;
        this.id = id;
        this.title = title;
        this.content = content;
        this.date = date;
        this.categoryType = categoryType;
    }

    public Board(String id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Board{" +
                "boardNo=" + boardNo +
                ", id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", date='" + date + '\'' +
                ", categoryType=" + categoryType +
                '}';
    }

    public int getBoardNo() {
        return boardNo;
    }

    public void setBoardNo(int boardNo) {
        this.boardNo = boardNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CategoryType getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(CategoryType categoryType) {
        this.categoryType = categoryType;
    }
}
