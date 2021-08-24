package pro.ninjacoder.test.squareservice.service;

import org.springframework.stereotype.Service;

@Service
public class TriangleServiceImpl implements SquareService {
    @Override
    public Double calculateSquare(Double[] params) {
        if (params == null || params.length < 2) {
            throw new RuntimeException("Необходимо задать a и b или h");
        }
        return 0.5 * (params[0] * params[1]);
    }
}
