package com.example.quran.mapper.impl;

import com.example.quran.dto.CenterRequest;
import com.example.quran.dto.CenterResponse;
import com.example.quran.mapper.CenterMapper;
import com.example.quran.model.entity.Center;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CenterMapperImpl implements CenterMapper {

    @Override
    public Center create(CenterRequest quranCenterRequest) {
        if (quranCenterRequest==null){
            return null;
        }
        Center quranCenter=new Center();
        quranCenter.setCompanyName(quranCenterRequest.getCompanyName());
        return quranCenter;
    }

    @Override
    public Center update(Center center, CenterRequest centerRequest) {
        center.setCompanyName(centerRequest.getCompanyName());
        return center;
    }

    @Override
    public CenterResponse view(Center center) {
        if (center==null) {
            return null;
        }
        CenterResponse centerResponse=new CenterResponse();
        if (center.getId()!=null){
            centerResponse.setId(center.getId());
        }
        centerResponse.setCompanyName(center.getCompanyName());
        return centerResponse;
    }

    @Override
    public List<CenterResponse> views(List<Center> quranCenters) {
        List<CenterResponse>quranCenterResponses=new ArrayList<>();
        for (Center q:quranCenters) {
            quranCenterResponses.add(view(q));
        }
        return quranCenterResponses;
    }
}
