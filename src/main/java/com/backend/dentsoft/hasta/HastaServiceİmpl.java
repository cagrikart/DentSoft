package com.backend.dentsoft.hasta;

import com.backend.dentsoft.core.utilities.results.DataResult;
import com.backend.dentsoft.core.utilities.results.Result;
import com.backend.dentsoft.core.utilities.results.SuccessDataResult;
import com.backend.dentsoft.core.utilities.results.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HastaServiceİmpl implements HastaService {

    @Autowired
    private HastaRepository hastaRepository;

    @Override
    public DataResult<List<Hasta>> getHasta() {
        return new SuccessDataResult<List<Hasta>>(this.hastaRepository.findAll());
    }

    @Override
    public Result addHasta(Hasta hasta) {
        this.hastaRepository.save(hasta);
        return new SuccessResult("hasta eklendi");
    }
}
