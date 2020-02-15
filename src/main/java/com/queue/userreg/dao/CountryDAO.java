package com.queue.userreg.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
import com.queue.userreg.model.Country;
import org.springframework.stereotype.Repository;
 
@Repository
public class CountryDAO {
 
    private static final Map<String, Country> COUNTRIES_MAP = new HashMap<>();
 
    static {
        initDATA();
    }
 
    private static void initDATA() {
 
        Country vn = new Country("VN", "Vietnam");
        Country en = new Country("EN", "England");
        Country fr = new Country("FR", "France");
        Country us = new Country("US", "US");
        Country ru = new Country("RU", "Russia");
        Country npl = new Country("NPL", "Nepal");
 
        COUNTRIES_MAP.put(vn.getCountryCode(), vn);
        COUNTRIES_MAP.put(en.getCountryCode(), en);
        COUNTRIES_MAP.put(fr.getCountryCode(), fr);
        COUNTRIES_MAP.put(us.getCountryCode(), us);
        COUNTRIES_MAP.put(ru.getCountryCode(), ru);
        COUNTRIES_MAP.put(npl.getCountryCode(), npl);
    }
 
    public Country findCountryByCode(String countryCode) {
        return COUNTRIES_MAP.get(countryCode);
    }
 
    public List<Country> getCountries() {
        List<Country> list = new ArrayList<>();
        list.addAll(COUNTRIES_MAP.values());
        return list;
    }
 
}
