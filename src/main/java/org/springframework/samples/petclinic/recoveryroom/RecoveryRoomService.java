package org.springframework.samples.petclinic.recoveryroom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecoveryRoomService {

    private RecoveryRoomRepository repo;

    @Autowired
    public RecoveryRoomService(RecoveryRoomRepository repo) {
		this.repo=repo;
	}
    public List<RecoveryRoom> getAll(){
        return repo.findAll();
    }

    public List<RecoveryRoomType> getAllRecoveryRoomTypes(){
        return repo.findAllRecoveryRoomTypes();
    }

    public RecoveryRoomType getRecoveryRoomType(String typeName) {
        return repo.getRecoveryRoomType(typeName);
    }

    public RecoveryRoom save(RecoveryRoom r) throws DuplicatedRoomNameException {
        return repo.save(r);       
    }

    
}
