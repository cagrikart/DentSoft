package com.backend.dentsoft.doktor;

import com.backend.dentsoft.core.utilities.results.DataResult;
import com.backend.dentsoft.core.utilities.results.Result;
import com.backend.dentsoft.hasta.Hasta;

import java.util.List;

public interface DoktorService {
    DataResult<List<Doktor>> getDoktor();
    Result addDoktor(Doktor doktor);
}
