package com.ohgiraffers.chap03.section01.graph_search;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/* 수업목표. BFS와 x, y 좌표를 활용한 문제 해결 -> 배열의 인덱스와 반대 개념 */
/* 필기.
 *  너비 우선 탐색(Breadth-First Search) -> 선입선출 구조에 queue 활용
 *  시작노드에서 출발해 시작 노드를 기준으로 가까운 노드를 먼저 방문하며 탐색하는 알고리즘
 * */
public class Application2 {
    public static BufferedReader toBufferedReader(String str) {
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

    static Queue<Node> q = new LinkedList<>();

    /* 설명. 상하좌우 개념의 좌표 배열들 */
    static int dirX[] = {0, 0, -1, 1};
    static int dirY[] = {-1, 1, 0, 0};

    /* 설명. 배추밭 */
    static int map[][];
    /* 설명. 방문한 배추 좌표 배열 */
    static boolean visit[][];
    /* 설명. 현재 위치에 대한 좌표 */
    static int curX, curY;
    /* 설명. 배추밭의 크기와 심어진 배추의 갯수 */
    static int N, M, K;
    /* 설명. x와 y 좌표를 인지한느 static 내부 클래스 */
    static int count;


    /* 설명. x와 y 좌표를 인지하는 static 내부 클래스 */
    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static int solution(String input) throws Exception {
        BufferedReader br = toBufferedReader(input);
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        M = Integer.valueOf(st.nextToken());
        N = Integer.valueOf(st.nextToken());
        K = Integer.valueOf(st.nextToken());

        /* 설명. 입력 받은 x, y 좌표와 배열을 만들 때의 순서(행, 열) -> 반대 개념 */
        map = new int[N][M];
        visit = new boolean[N][M];

        /* 설명. 배추밭에 배추 심기 */
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer((br.readLine()));
            int x = Integer.valueOf(st.nextToken());
            int y = Integer.valueOf(st.nextToken());

            map[y][x] = 1;
        }

        count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                /* 설명. 방문 안 한 위치에 배추가 심어진 경우 */
                if (visit[i][j] == false && map[i][j] == 1) {
                    count++;
                    bfs(j, i);           // bfs 인자 -> x좌표, y좌표 순으로 받을 것이므로 i와 j 확인하고 넘겨줌
                }
            }
        }
        return count;
    }

    /* 설명. 상하좌우에 배추가 심어져있는 경우 -> 한 번씩 동작 (기본적으로는 이렇고 방문 배열에 대해서는 다른 의미) */
    static void bfs(int x, int y) {
        q.offer(new Node(x, y));
        visit[y][x] = true;

        /* 설명. 연속적으로 상하좌우에 배추가 심어진 경우 -> 반복 */
        while (!q.isEmpty()) {
            Node node = q.poll();

            /* 설명. 상하좌우 살펴보기 */
            for (int i = 0; i < 4; i++) {
                curX = node.x + dirX[i];
                curY = node.y + dirY[i];

                /* 설명. 지금 보는 방향이 좌표로써 존재하면서 방문한 적이 없고 배추가 심어진 경우 */
                if (range_check() && visit[curY][curX] == false && map[curY][curX] == 1) {
                    q.offer(new Node(curX, curY));
                    visit[curY][curX] = true;
                }
            }
        }
    }

    private static boolean range_check() {
        return curX >= 0 && curX < M && curY >= 0 && curY < N;
    }
}
