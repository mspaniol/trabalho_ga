/*
Navicat MySQL Data Transfer

Source Server         : localhost xampp
Source Server Version : 50524
Source Host           : localhost:3306
Source Database       : trabalho_ga

Target Server Type    : MYSQL
Target Server Version : 50524
File Encoding         : 65001

Date: 2014-08-25 20:29:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `aluno`
-- ----------------------------
DROP TABLE IF EXISTS `aluno`;
CREATE TABLE `aluno` (
  `AlunoID` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(100) NOT NULL,
  PRIMARY KEY (`AlunoID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of aluno
-- ----------------------------
INSERT INTO `aluno` VALUES ('1', 'Mozart');
INSERT INTO `aluno` VALUES ('2', 'Renato');
INSERT INTO `aluno` VALUES ('3', 'Jonathan');

-- ----------------------------
-- Table structure for `disciplina`
-- ----------------------------
DROP TABLE IF EXISTS `disciplina`;
CREATE TABLE `disciplina` (
  `DisciplinaID` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(100) NOT NULL,
  PRIMARY KEY (`DisciplinaID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of disciplina
-- ----------------------------
INSERT INTO `disciplina` VALUES ('1', 'Matemática');
INSERT INTO `disciplina` VALUES ('2', 'Português');
INSERT INTO `disciplina` VALUES ('3', 'Inglês');

-- ----------------------------
-- Table structure for `equipe`
-- ----------------------------
DROP TABLE IF EXISTS `equipe`;
CREATE TABLE `equipe` (
  `EquipeID` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(100) NOT NULL,
  PRIMARY KEY (`EquipeID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of equipe
-- ----------------------------
INSERT INTO `equipe` VALUES ('1', 'equipe A');
INSERT INTO `equipe` VALUES ('2', 'equipe B');
INSERT INTO `equipe` VALUES ('3', 'equipe C');

-- ----------------------------
-- Table structure for `equipealuno`
-- ----------------------------
DROP TABLE IF EXISTS `equipealuno`;
CREATE TABLE `equipealuno` (
  `EquipeAluno` int(11) NOT NULL AUTO_INCREMENT,
  `EquipeID` int(11) NOT NULL,
  `AlunoID` int(11) NOT NULL,
  PRIMARY KEY (`EquipeAluno`),
  KEY `fk_EquipeAluno_Equipe1` (`EquipeID`),
  KEY `fk_EquipeAluno_Aluno1` (`AlunoID`),
  CONSTRAINT `fk_EquipeAluno_Aluno1` FOREIGN KEY (`AlunoID`) REFERENCES `aluno` (`AlunoID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_EquipeAluno_Equipe1` FOREIGN KEY (`EquipeID`) REFERENCES `equipe` (`EquipeID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of equipealuno
-- ----------------------------

-- ----------------------------
-- Table structure for `trabalho`
-- ----------------------------
DROP TABLE IF EXISTS `trabalho`;
CREATE TABLE `trabalho` (
  `TrabalhoID` int(11) NOT NULL AUTO_INCREMENT,
  `Titulo` varchar(100) NOT NULL,
  `Descricao` text NOT NULL,
  `DisciplinaID` int(11) NOT NULL,
  `EquipeID` int(11) NOT NULL,
  `Nota` float(6,0) DEFAULT NULL,
  `Observacao` text,
  PRIMARY KEY (`TrabalhoID`),
  KEY `fk_Trabalho_Disciplina1` (`DisciplinaID`),
  KEY `fk_Trabalho_Equipe1` (`EquipeID`),
  CONSTRAINT `fk_Trabalho_Disciplina1` FOREIGN KEY (`DisciplinaID`) REFERENCES `disciplina` (`DisciplinaID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Trabalho_Equipe1` FOREIGN KEY (`EquipeID`) REFERENCES `equipe` (`EquipeID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of trabalho
-- ----------------------------
INSERT INTO `trabalho` VALUES ('1', 'teste trab 1', 'teste da funcionalidade do trabalho	', '2', '2', '7', 'teaste');

-- ----------------------------
-- Table structure for `turma`
-- ----------------------------
DROP TABLE IF EXISTS `turma`;
CREATE TABLE `turma` (
  `TurmaID` int(11) NOT NULL AUTO_INCREMENT,
  `DisciplinaID` int(11) NOT NULL,
  `Semestre` varchar(100) NOT NULL,
  PRIMARY KEY (`TurmaID`),
  KEY `fk_Turma_Disciplina1` (`DisciplinaID`),
  KEY `fk_Turma_Semestre1` (`Semestre`),
  CONSTRAINT `fk_Turma_Disciplina1` FOREIGN KEY (`DisciplinaID`) REFERENCES `disciplina` (`DisciplinaID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of turma
-- ----------------------------
INSERT INTO `turma` VALUES ('1', '1', '2014/02');
INSERT INTO `turma` VALUES ('2', '2', '2014/02');
INSERT INTO `turma` VALUES ('3', '3', '2014/03');

-- ----------------------------
-- Table structure for `turmaaluno`
-- ----------------------------
DROP TABLE IF EXISTS `turmaaluno`;
CREATE TABLE `turmaaluno` (
  `TurmaAlunoID` int(11) NOT NULL AUTO_INCREMENT,
  `TurmaID` int(11) NOT NULL,
  `AlunoID` int(11) NOT NULL,
  PRIMARY KEY (`TurmaAlunoID`),
  KEY `fk_TurmaAluno_Turma1` (`TurmaID`),
  KEY `fk_TurmaAluno_Aluno1` (`AlunoID`),
  CONSTRAINT `fk_TurmaAluno_Aluno1` FOREIGN KEY (`AlunoID`) REFERENCES `aluno` (`AlunoID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_TurmaAluno_Turma1` FOREIGN KEY (`TurmaID`) REFERENCES `turma` (`TurmaID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of turmaaluno
-- ----------------------------
INSERT INTO `turmaaluno` VALUES ('1', '3', '1');
