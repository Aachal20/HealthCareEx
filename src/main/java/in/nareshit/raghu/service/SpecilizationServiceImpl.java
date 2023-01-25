package in.nareshit.raghu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nareshit.raghu.entity.Specilization;
import in.nareshit.raghu.repo.SpecializationRepository;
@Service
public class SpecilizationServiceImpl implements ISpecilizationService {

	@Autowired
	private SpecializationRepository repo;

	@Override
	public Long saveSpecilization(Specilization spec) {
		Specilization specilization = repo.save(spec);
		return specilization.getId();
	}

	@Override
	public List<Specilization> getAllSpecilizations() {
		List<Specilization> list = repo.findAll();
		return list;
	}

	@Override
	public void removeSpecilization(Long id) {
		repo.deleteById(id);

	}

	@Override
	public Specilization getOneSpecilization(Long id) {
		Optional<Specilization> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}

		else {
			return null;
		}
	}

	@Override
	public void updateSpecilization(Specilization spec) {
		repo.save(spec);

	}

}
