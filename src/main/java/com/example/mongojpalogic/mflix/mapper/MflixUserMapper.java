package com.example.mongojpalogic.mflix.mapper;


import com.example.mongojpalogic.mapper.GenericMapper;
import com.example.mongojpalogic.mflix.document.Users;
import com.example.mongojpalogic.mflix.dto.MflixUserRes;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MflixUserMapper extends GenericMapper<MflixUserRes, Users> {
    MflixUserMapper INSTANCE = Mappers.getMapper(MflixUserMapper.class);
}
