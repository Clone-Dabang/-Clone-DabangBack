//package com.project.dabang.service;
//
//import com.project.dabang.domain.Post;
//import com.project.dabang.dto.PostDetailResponseDto;
//import com.project.dabang.repository.PostDetailRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//@Service
//@RequiredArgsConstructor
//@Transactional(readOnly = true)
//public class PostService {
//
//    private final PostDetailRepository postDetailRepository;
//
////    public PostDetailResponseDto findById(Long id) {
////        Post post = postDetailRepository.findById(id).orElseThrow(
////                () -> new IllegalArgumentException("해당 게시물이 없습니다.")
////        );
////
////        return new PostDetailResponseDto(post,);
////    }
//}
