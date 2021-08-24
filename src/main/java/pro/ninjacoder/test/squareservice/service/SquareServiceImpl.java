package pro.ninjacoder.test.squareservice.service;

import org.springframework.stereotype.Service;

@Service
public class SquareServiceImpl implements SquareService {
    @Override
    public Double calculateSquare(Double[] params) {
        if (params == null || params.length <= 0) {
            throw new RuntimeException("Необходимо задать длину стороны квадрата");
        }
        return Math.pow(params[0], 2);
    }
}
