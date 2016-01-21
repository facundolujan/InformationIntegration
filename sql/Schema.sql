-- CREATING DATABASE

CREATE DATABASE IF NOT EXISTS InfoIntegration;

-- CREATING SCHEMA
CREATE SCHEMA IF NOT EXISTS InfoIntegration;

-- CREATING TABLES

CREATE TABLE IF  NOT EXISTS InfoIntegration.Country (
ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
iso varchar(4) UNIQUE,
name varchar(40) UNIQUE,
incomingGroup varchar(25),
region varchar(50)
);

CREATE TABLE IF  NOT EXISTS InfoIntegration.Indicator (
ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
code varchar(20) ,
notes LONGTEXT,
descriptor LONGTEXT,
units varchar(25),
scale varchar(25),
source LONGTEXT,
countryNotes LONGTEXT
);

CREATE TABLE IF  NOT EXISTS InfoIntegration.Value(
ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
fk_country int REFERENCES Country(ID),
fk_indicator int REFERENCES Indicator(ID),
year1980 FLOAT,
year1981 FLOAT,
year1982 FLOAT,
year1983 FLOAT,
year1984 FLOAT,
year1985 FLOAT,
year1986 FLOAT,
year1987 FLOAT,
year1988 FLOAT,
year1989 FLOAT,
year1990 FLOAT,
year1991 FLOAT,
year1992 FLOAT,
year1993 FLOAT,
year1994 FLOAT,
year1995 FLOAT,
year1996 FLOAT,
year1997 FLOAT,
year1998 FLOAT,
year1999 FLOAT,
year2000 FLOAT,
year2001 FLOAT,
year2002 FLOAT,
year2003 FLOAT,
year2004 FLOAT,
year2005 FLOAT,
year2006 FLOAT,
year2007 FLOAT,
year2008 FLOAT,
year2009 FLOAT,
year2010 FLOAT,
year2011 FLOAT,
year2012 FLOAT,
year2013 FLOAT,
year2014 FLOAT,
year2015 FLOAT,
year2016 FLOAT,
year2017 FLOAT,
year2018 FLOAT,
year2019 FLOAT,
year2020 FLOAT,
estimatesAfter FLOAT
);

