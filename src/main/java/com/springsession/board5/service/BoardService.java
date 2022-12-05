package com.springsession.board5.service;

import com.springsession.board5.entity.Crud;
import com.springsession.board5.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    //글 작성
    public void write(Crud crud){

        boardRepository.save(crud);

    }

    //게시물 리스트 처리
    public Page<Crud> boardList(Pageable pageable){
        return  boardRepository.findAll(pageable);
    }

    //특정 게시물 불러오기
    public  Crud boardView(Integer id){

        return boardRepository.findById(id).get();
    }

    //게시글 검색
    public  Page<Crud> boardSearchList(String searchKeyword,Pageable pageable){

        return boardRepository.findByTitleContaining(searchKeyword, pageable);
    }


    //특정 게시글 삭제
    public void boardDelete(Integer id){

        boardRepository.deleteById(id);
    }



}
