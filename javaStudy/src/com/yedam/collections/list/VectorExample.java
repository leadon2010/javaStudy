package com.yedam.collections.list;

import java.util.List;
import java.util.Vector;

import ac.yedam.board.Board;

public class VectorExample {
	public static void main(String[] args) {
		List<Board> list = new Vector<>();
		list.add(new Board("제목1", "내용1", "작성자1"));
		list.add(new Board("제목2", "내용2", "작성자2"));
		list.add(new Board("제목3", "내용3", "작성자3"));
		list.add(new Board("제목4", "내용4", "작성자4"));
		list.add(new Board("제목5", "내용5", "작성자5"));
		Board board = list.remove(2);
		System.out.println(board);
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getTitle() + "/" + list.get(i).getContent() + "/" + list.get(i).getWriter());
		}
	}
}
