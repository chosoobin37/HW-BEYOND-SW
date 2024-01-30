package run;

import aggregate.Board;
import aggregate.CategoryType;
import service.BoardService;

import java.util.Scanner;

public class Application {

    private static final BoardService bs = new BoardService();
    private static Object sb;

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("======= 게시판 =======");
            System.out.println("1. 조회");
            System.out.println("2. 게시글 작성");
            System.out.println("3. 게시글 삭제");
            System.out.println("4. 게시글 수정");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴를 선택해 주세요: ");
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.println("1. 전체");
                    System.out.println("2. 카테고리");
                    System.out.println("3. 내용");
                    int input1 = sc.nextInt();
                    switch (input1){
                        case 1:
                            sb.viewBoards();
                            break;
                        case 2:
                            //서비스
                            break;
                        case 3:
                            //서비스
                            break;
                        case 9:
                            System.out.println("뒤로가기");
                            return;
                        default:
                            System.out.println("번호를 제대로 다시 입력해 주세요");
                    }
                    break;
                case 2:
                    mm.selectMember(chooseMemberNo());
                    break;
                case 3:
                    mm.registMember(signUp());
                    break;
                case 4:
                    mm.deleteMember(chooseMemberNo());
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("번호를 제대로 다시 입력해 주세요");
            }
        }
    }
    private static Board signUp() {

        Board newInfo = null;

        System.out.print("ID를 입력하세요: ");
        String id = sc.nextLine();

        System.out.print("게시물 제목을 입력하세요: ");
        String title = sc.nextLine();

        System.out.print("게시물 내용을 입력하세요: ");
        String content = sc.nextLine();
        sc.nextLine();

        newInfo = new Board(id, title, content);

        System.out.print("게시판 종류를 입력하세요: ");
        String categoryType = sc.next().toUpperCase();
        CategoryType ct = null;
        switch (categoryType) {
            case "Free":
                ct = CategoryType.FREE;
                break;
            case "Share":
                ct = CategoryType.SHARE;
                break;
            case "Into":
                ct = CategoryType.INTRO;
                break;
            case "Review":
                ct = CategoryType.REVIEW;
                break;
            case "QNA":
                ct = CategoryType.QNA;
                break;
            default:
                System.out.println("존재하지 않는 카테고리입니다.");
                ct = null;
        }

        newInfo.setCategoryType(ct);

        return newInfo;
    }
}
