package com.tk.exam1.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdrMapper {
    Long findAddressIdByAdress(String address);
    String findAdressByAdressId(Long AddressId);
}
