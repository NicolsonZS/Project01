package cn.devmgr.tutorial;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/tvseries")
public class TvSeriesController {
    private static final Log log = LogFactory.getLog(TvSeriesController.class);

    @GetMapping
    public List<TvSeriesDto> getAll() {
        if (log.isTraceEnabled()) {
            log.trace("getAll();被调用了");
        }
        List<TvSeriesDto> list = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, Calendar.OCTOBER, 2, 0, 0);
        list.add(new TvSeriesDto(1, "WestWorld", 1, calendar.getTime()));
        //calendar.set(2011,Calendar.SEPTEMBER,2,0,0);
        //list.add(new TvSeriesDto(1,"Person of Interest",5,calendar.getTime()));
        return list;
    }
}


