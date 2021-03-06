package com.shinetech.dalian.mikado.dao;

import com.shinetech.dalian.mikado.entity.PackageInfoEntity;

import java.util.List;
import java.util.Map;

public interface PackageInfoDao {
    List<PackageInfoEntity> getPackageInfoList(Integer startPosition, Integer maxResult);

    List<PackageInfoEntity> getPackageInfoList(Integer startPosition, Integer maxResult,String packageItemName);

    Integer getPackageInfoListSize();

    Integer getPackageInfoListSizeByPackageItemName(String packageItemName);

    List<PackageInfoEntity> queryPackageInfoList(String packageItemCode, String packageItemName,Integer startPosition,Integer maxResult);

    void savePackageInfoEntity(PackageInfoEntity packageInfoEntity);

    void delPackageInfoEntity(PackageInfoEntity packageInfoEntity);

    Integer savePackageInfoEntityList( List<PackageInfoEntity> packageInfoEntityList);
}
