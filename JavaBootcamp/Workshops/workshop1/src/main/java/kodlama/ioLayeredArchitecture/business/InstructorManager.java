package kodlama.ioLayeredArchitecture.business;

import kodlama.ioLayeredArchitecture.core.logging.Logger;
import kodlama.ioLayeredArchitecture.dataAccess.InstructorDao;
import kodlama.ioLayeredArchitecture.entities.Instructor;

public class InstructorManager {
    private final InstructorDao instructorDao;
    private Logger[] loggers;

    public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor) {
        instructorDao.add(instructor);
        for (Logger logger : loggers) {
            logger.log(instructor.getName());
        }
    }
}
