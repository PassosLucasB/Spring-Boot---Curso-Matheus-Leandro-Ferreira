package EstudosDeSpringBoot.SpringBoot_MLF2025.service;

import org.springframework.stereotype.Service;

import EstudosDeSpringBoot.SpringBoot_MLF2025.repository.MensagemRepository;

@Service
public class MensagemService {
    
    private final MensagemRepository mensagemRepository;

    public MensagemService(MensagemRepository mensagemRepository){
        this.mensagemRepository = mensagemRepository;
    }

    public String obterMensagem(){
        return mensagemRepository.obterMensagem();
    }

}
