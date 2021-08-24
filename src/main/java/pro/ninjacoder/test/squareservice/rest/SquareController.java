package pro.ninjacoder.test.squareservice.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.ninjacoder.test.squareservice.service.SquareService;

@RestController
public class SquareController {

    @Autowired
    @Qualifier("circleServiceImpl")
    private SquareService circleService;
    @Autowired
    @Qualifier("rectangleServiceImpl")
    private SquareService rectangleService;
    @Autowired
    @Qualifier("squareServiceImpl")
    private SquareService squareService;
    @Autowired
    @Qualifier("triangleServiceImpl")
    private SquareService triangleService;

    @GetMapping("/circle")
    public Double circle(@RequestParam("r") Double r) {
        return circleService.calculateSquare(new Double[]{r});
    }

    @GetMapping("/square")
    public Double square(@RequestParam("a") Double a) {
        return squareService.calculateSquare(new Double[]{a});
    }

    @GetMapping("/rectangle")
    public Double reactangle(@RequestParam("a") Double a, @RequestParam("b") Double b) {
        return rectangleService.calculateSquare(new Double[]{a, b});
    }

    @GetMapping("/triangle")
    public Double triangle(@RequestParam("a") Double a, @RequestParam("b") Double b) {
        return triangleService.calculateSquare(new Double[]{a, b});
    }
}
