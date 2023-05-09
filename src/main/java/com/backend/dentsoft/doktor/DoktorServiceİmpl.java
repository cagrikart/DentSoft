package com.backend.dentsoft.doktor;

import com.backend.dentsoft.core.utilities.results.DataResult;
import com.backend.dentsoft.core.utilities.results.Result;
import com.backend.dentsoft.core.utilities.results.SuccessDataResult;
import com.backend.dentsoft.core.utilities.results.SuccessResult;
import com.backend.dentsoft.hasta.Hasta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoktorServiceİmpl implements DoktorService {

    @Autowired
    private DoktorRepository doktorRepository;

    @Override
    public DataResult<List<Doktor>> getDoktor() {
        return new SuccessDataResult<List<Doktor>>(this.doktorRepository.findAll());
    }

    @Override
    public Result addDoktor(Doktor doktor) {
        this.doktorRepository.save(doktor);
        return new SuccessResult("doktor eklendi");
    }
}
