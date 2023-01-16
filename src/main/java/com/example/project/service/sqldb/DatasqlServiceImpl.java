package com.example.project.service.sqldb;

import com.example.project.entity.region_waste;
import com.example.project.repository.sqldb.SqldbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DatasqlServiceImpl implements DatasqlService {



    private final SqldbRepository sqldbRepository;

    @Autowired
    public DatasqlServiceImpl(SqldbRepository sqldbRepository) {
        this.sqldbRepository = sqldbRepository;
    }


    /**
     * Sql db 데이터 출력 메서드
     *
     * @return List<region_waste>
     */
    @Override
    public List<region_waste> getSqldb() {
        return sqldbRepository.findAll();
    }
}
