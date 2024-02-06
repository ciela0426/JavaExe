package ch10.collection01.ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		//ArrayList 컬렉션 생성
		List<Board> list = new ArrayList<>();
		
		// 객체 추가
		list.add(new Board("title1", "contents1", "writer1"));
		list.add(new Board("title2", "contents2", "writer2"));
		list.add(new Board("title3", "contents3", "writer3"));
		list.add(new Board("title4", "contents4", "writer4"));
		list.add(new Board("title5", "contents5", "writer5"));
		
		// 저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("총 객체 수 : " + size);
		System.out.println();
		
		// 특정 index의 객체 가져오기
		Board board = list.get(2);
		System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
		System.out.println();
		
		// 모든 객체를 하나씩 가져오기
		for(int i = 0; i < list.size(); i++) {
			Board b = list.get(i);
			System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
		}
		System.out.println();
		
		// 객체 삭제 -> index2를 삭제하면 index 3가 index 2로 변경되므로 다시 index2를 지울 수 있음
		list.remove(2);
		list.remove(2);
		
		// 향상된 for문으로 모든 객체를 하나씩 가져오기
		for (Board b : list) {
			System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
		}
	}
}
