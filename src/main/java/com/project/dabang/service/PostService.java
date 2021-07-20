//package com.project.dabang.service;
//
//import com.project.dabang.domain.Post;
//import com.project.dabang.domain.construction.Appliance;
//import com.project.dabang.domain.construction.Construction;
//import com.project.dabang.domain.trade.Trade;
//import com.project.dabang.dto.PostDetailResponseDto;
//import com.project.dabang.repository.PostRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//@Service
//@RequiredArgsConstructor
//@Transactional(readOnly = true)
//public class PostService {
//
//    private final PostRepository postRepository;
//
//    public PostDetailResponseDto findById(Long id) {
//        Post post = postRepository.findById(id).orElseThrow(
//                () -> new IllegalArgumentException("해당 게시물이 없습니다.")
//        );
//        return new PostDetailResponseDto(Post post, Trade trade, Construction construction, Appliance appliance);
//    }
//}
