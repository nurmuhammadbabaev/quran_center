package com.example.quran.mapper;

import com.example.quran.dto.CenterRequest;
import com.example.quran.dto.CenterResponse;
import com.example.quran.model.entity.Center;

import java.util.List;

public interface CenterMapper {

    Center create(CenterRequest quranCenterRequest);

    Center update(Center quranCenter, CenterRequest quranCenterRequest);

    CenterResponse view(Center quranCenter);

    List<CenterResponse> views(List<Center> quranCenters);
}
