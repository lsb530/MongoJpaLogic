package com.example.mongojpalogic.mflix.service;

import com.example.mongojpalogic.mflix.document.Users;
import com.example.mongojpalogic.mflix.dto.MflixUserRes;
import com.example.mongojpalogic.mflix.mapper.MflixUserMapper;
import com.example.mongojpalogic.mflix.repository.MflixUserUserRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MflixUserService {

    private final MflixUserUserRepository mflixUserRepository;

    public List<MflixUserRes> getMflixUsers() {
        List<Users> users = mflixUserRepository.findAll();
        return users.stream().map(MflixUserMapper.INSTANCE::toDto).toList();
    }

    public MflixUserRes getMflixUser(String name) {
        Users wowThisIsJustUser = mflixUserRepository.findUsersByNameContainingIgnoreCase(name)
            .orElseThrow(RuntimeException::new);
        mflixUserRepository.findUsersByNameContainingIgnoreCase(name).stream()
            .map(users -> users.getName()).distinct().findFirst();
        return null;
    }

    public Object getMflixUsersWithAge(int age) {
        AggregationResults<?> aggResult = mflixUserRepository.findTestAggregation(age);
        return aggResult.getMappedResults();
    }
    
}
