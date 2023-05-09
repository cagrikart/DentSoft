package com.backend.dentsoft.hasta;

import com.backend.dentsoft.core.utilities.results.DataResult;
import com.backend.dentsoft.core.utilities.results.Result;

import java.util.List;

public interface HastaService {
    DataResult<List<Hasta>> getHasta();
    Result addHasta(Hasta hasta);
}
