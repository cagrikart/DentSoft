package com.backend.dentsoft.hasta;

import com.backend.dentsoft.core.utilities.results.DataResult;
import com.backend.dentsoft.core.utilities.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/hasta")
@CrossOrigin("*")
public class HastaController {
    @Autowired
    private HastaService hastaService;

    @GetMapping("/getHasta")
    public DataResult<List<Hasta>> getHasta() {
        return this.hastaService.getHasta();
    }

    @PostMapping("/addHasta")
    public Result addHasta(Hasta hasta) {
        return this.hastaService.addHasta(hasta);
    }
}
