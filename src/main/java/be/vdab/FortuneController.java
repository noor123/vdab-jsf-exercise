package be.vdab;

import be.vdab.domain.Fortune;
import be.vdab.repository.FortuneRepository;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class FortuneController {
    @Inject
    private FortuneRepository fortuneRepository;

    public String saySomethingCool() {
        List<Fortune> fortunes = fortuneRepository.findAll();
        return fortunes.get((int) (Math.random() * fortunes.size())).getMessage();
    }
}
