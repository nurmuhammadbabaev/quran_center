package com.example.quran.service.impl;

import com.example.quran.dto.CenterRequest;
import com.example.quran.dto.CenterResponse;
import com.example.quran.exception.BadRequest;
import com.example.quran.mapper.CenterMapper;
import com.example.quran.model.entity.Center;
import com.example.quran.repository.CenterRepository;
import com.example.quran.service.CenterService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class CenterServiceImpl implements CenterService {
    private final CenterMapper mapper;
    private final CenterRepository repository;

    @Override
    public CenterResponse create(CenterRequest quranCenterRequest) {
        return mapper.view(repository.save(mapper.create(quranCenterRequest)));
    }

    @Override
    public CenterResponse update(Long id, CenterRequest centerRequest) {
        Center qcenter=repository.findById(id).
                orElseThrow(()->new BadRequest("Id is null!"));

        mapper.update(qcenter,centerRequest);
        return mapper.view(repository.save(qcenter));
    }

    @Override
    public CenterResponse getById(Long id) {
        return mapper.view(repository.findById(id).orElseThrow(()-> new BadRequest("id  is null!")));
    }

    @Override
    public CenterResponse deleteById(Long id) {
        Center quranCenter=repository.findById(id).orElseThrow(()->new BadRequest("id is null!"));
        repository.deleteById(id);
        return mapper.view(quranCenter);
    }

    @Override
    public List<CenterResponse> getAll() {
        return mapper.views(repository.findAll());
    }
}
