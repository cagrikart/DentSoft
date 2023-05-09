package com.backend.dentsoft.doktor;

import com.backend.dentsoft.core.utilities.results.DataResult;
import com.backend.dentsoft.core.utilities.results.Result;
import com.backend.dentsoft.hasta.Hasta;
import com.backend.dentsoft.hasta.HastaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/doktor")
@CrossOrigin("*")
public class DoktorController {
    @Autowired
    private DoktorService doktorService;

    @GetMapping("/getDoktor")
    public DataResult<List<Doktor>> getDoktor() {
        return this.doktorService.getDoktor();
    }

    @PostMapping("/addDoktor")
    public Result addDoktor(Doktor doktor) {
        return this.doktorService.addDoktor(doktor);
    }
}
