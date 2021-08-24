package pro.ninjacoder.test.squareservice.service;

import org.springframework.stereotype.Service;

@Service
public class CircleServiceImpl implements SquareService {
    @Override
    public Double calculateSquare(Double[] params) {
        if (params == null || params.length <= 0) {
            throw new RuntimeException("Необходимо задать радиус");
        }
        return Math.PI * Math.pow(params[0], 2);
    }
}
