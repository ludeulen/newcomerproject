package com.example.project.service.sqldb;

import com.example.project.entity.region_waste;
import java.util.List;

/**
 * Sql에서 받은 데이터를 관리하는 class
 */
public interface DatasqlService {

    /**
     * sql 데이터 출력 메서드
     * @return List<Sqldb>
     */
    List<region_waste> getSqldb();
}
