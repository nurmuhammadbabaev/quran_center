package com.example.quran.service;

import com.example.quran.dto.CenterRequest;
import com.example.quran.dto.CenterResponse;

import java.util.List;

public interface CenterService {

    CenterResponse create(CenterRequest quranCenterRequest);

    CenterResponse update(Long id, CenterRequest centerRequest);

    CenterResponse getById(Long id);

    CenterResponse deleteById(Long id);

    List<CenterResponse> getAll();
}
