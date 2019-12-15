-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema topic4sql
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema topic4sql
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `topic4sql` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `topic4sql` ;

-- -----------------------------------------------------
-- Table `topic4sql`.`teacher`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `topic4sql`.`teacher` (
  `idteacher` INT(11) NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NULL DEFAULT NULL,
  `last_name` VARCHAR(45) NULL DEFAULT NULL,
  `date_of_birth` DATE NULL DEFAULT NULL,
  PRIMARY KEY (`idteacher`))
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `topic4sql`.`course`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `topic4sql`.`course` (
  `idcourse` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  `asigned_teacher` VARCHAR(45) NULL DEFAULT NULL,
  `hours_by_week` INT(11) NULL DEFAULT NULL,
  `teacher_idteacher` INT(11) NOT NULL,
  PRIMARY KEY (`idcourse`, `teacher_idteacher`),
  INDEX `fk_course_teacher1_idx` (`teacher_idteacher` ASC) VISIBLE,
  CONSTRAINT `fk_course_teacher1`
    FOREIGN KEY (`teacher_idteacher`)
    REFERENCES `topic4sql`.`teacher` (`idteacher`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `topic4sql`.`student`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `topic4sql`.`student` (
  `idstudent` INT(11) NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NULL DEFAULT NULL,
  `last_name` VARCHAR(45) NULL DEFAULT NULL,
  `registration_number` INT(11) NULL DEFAULT NULL,
  `date_of_birth` DATE NULL DEFAULT NULL,
  PRIMARY KEY (`idstudent`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `topic4sql`.`course_has_student`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `topic4sql`.`course_has_student` (
  `course_idcourse` INT(11) NOT NULL,
  `student_idstudent` INT(11) NOT NULL,
  `partial_1` INT(11) NULL DEFAULT NULL,
  `partial_2` INT(11) NULL DEFAULT NULL,
  `partial_3` INT(11) NULL DEFAULT NULL,
  `final_note` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`course_idcourse`, `student_idstudent`),
  INDEX `fk_course_has_student_student1_idx` (`student_idstudent` ASC) VISIBLE,
  INDEX `fk_course_has_student_course_idx` (`course_idcourse` ASC) VISIBLE,
  CONSTRAINT `fk_course_has_student_course`
    FOREIGN KEY (`course_idcourse`)
    REFERENCES `topic4sql`.`course` (`idcourse`),
  CONSTRAINT `fk_course_has_student_student1`
    FOREIGN KEY (`student_idstudent`)
    REFERENCES `topic4sql`.`student` (`idstudent`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `topic4sql`.`weekday`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `topic4sql`.`weekday` (
  `idweekday` INT(11) NOT NULL AUTO_INCREMENT,
  `weekday` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`idweekday`))
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `topic4sql`.`schedule_time`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `topic4sql`.`schedule_time` (
  `idschedule_time` INT(11) NOT NULL AUTO_INCREMENT,
  `start_time` TIME NOT NULL,
  `end_time` TIME NOT NULL,
  `weekday_idweekday` INT(11) NOT NULL,
  `course_idcourse` INT(11) NOT NULL,
  `course_teacher_idteacher` INT(11) NOT NULL,
  PRIMARY KEY (`idschedule_time`, `weekday_idweekday`, `course_idcourse`, `course_teacher_idteacher`),
  INDEX `fk_schedule_time_weekday1_idx` (`weekday_idweekday` ASC) VISIBLE,
  INDEX `fk_schedule_time_course1_idx` (`course_idcourse` ASC, `course_teacher_idteacher` ASC) VISIBLE,
  CONSTRAINT `fk_schedule_time_course1`
    FOREIGN KEY (`course_idcourse` , `course_teacher_idteacher`)
    REFERENCES `topic4sql`.`course` (`idcourse` , `teacher_idteacher`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_schedule_time_weekday1`
    FOREIGN KEY (`weekday_idweekday`)
    REFERENCES `topic4sql`.`weekday` (`idweekday`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
AUTO_INCREMENT = 10
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
