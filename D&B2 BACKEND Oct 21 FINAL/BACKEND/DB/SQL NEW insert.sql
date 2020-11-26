INSERT INTO `mydb`.`store` (`storeID`, `spassword`, `sname`) VALUES ('1001', '111', 'Apple');
INSERT INTO `mydb`.`store` (`storeID`, `spassword`, `sname`) VALUES ('1002', '321123', 'Steam');

INSERT INTO `mydb`.`commodity` (`commodityID`, `cname`, `price`, `introduction`, `store_storeID`, `type`, `addedDate`, `picName`) VALUES ('8001', 'YAMAHA Classic Piano DXR1', '1299', 'Piano', '1001', 'Classic', '2000-01-01', '100.jpeg');
INSERT INTO `mydb`.`commodity` (`commodityID`, `cname`, `price`, `introduction`, `store_storeID`, `type`, `addedDate`, `picName`) VALUES ('8002', 'YAMAHA Classic Piano C99', '3999', 'Piano', '1002', 'Classic', '2020-08-10', '101.jpeg');
INSERT INTO `mydb`.`commodity` (`commodityID`, `cname`, `price`, `introduction`, `store_storeID`, `type`, `addedDate`, `picName`) VALUES ('8003', 'YAMAHA Classic Violin CV1', '7000', 'Violin', '1002', 'Classic', '2020-08-10', '102.jpeg');
INSERT INTO `mydb`.`commodity` (`commodityID`, `cname`, `price`, `introduction`, `store_storeID`, `type`, `addedDate`, `picName`) VALUES ('8004', 'YAMAHA Electronic Violin CV1', '19000', 'Violin', '1001', 'Electronic', '2000-08-10', '103.jpeg');
INSERT INTO `mydb`.`commodity` (`commodityID`, `cname`, `price`, `introduction`, `store_storeID`, `type`, `addedDate`, `picName`) VALUES ('8005', 'YAMAHA Classic Piano Pro CPP68', '99000', 'Violin', '1001', 'Classic', '2020-09-10', '101.jpeg');
INSERT INTO `mydb`.`commodity` (`commodityID`, `store_storeID`, `cname`, `price`, `introduction`, `type`, `addedDate`, `picName`) VALUES ('8006', '1001', 'Johannes Broadwood Classic Piano 1', '10999', 'Piano', 'Classic', '2010-10-28', '106.jpeg');
INSERT INTO `mydb`.`commodity` (`commodityID`, `store_storeID`, `cname`, `price`, `introduction`, `type`, `addedDate`, `picName`) VALUES ('8007', '1002', 'K.WEEBER Classic Piano Advanced EDTION', '9999', 'Piano', 'Classic', '2019-06-23', '107.jpg');
INSERT INTO `mydb`.`commodity` (`commodityID`, `store_storeID`, `cname`, `price`, `introduction`, `type`, `addedDate`, `picName`) VALUES ('8008', '1001', 'YAMAHA XClassic Piano Pro P199', '18999', 'Piano', 'Classic', '2010-10-23', '108.jpg');
INSERT INTO `mydb`.`commodity` (`commodityID`, `store_storeID`, `cname`, `price`, `introduction`, `type`, `addedDate`, `picName`) VALUES ('8009', '1002', 'K.WEEBER Classic Piano SP10', '2999', 'Piano', 'Classic', '2009-01-01', '109.jpg');
INSERT INTO `mydb`.`commodity` (`commodityID`, `store_storeID`, `cname`, `price`, `introduction`, `type`, `addedDate`, `picName`) VALUES ('8010', '1001', 'YAMAHA Eletronic Piano EX10', '8920', 'Piano', 'Eletronic', '2019-8-7', '110.jpeg');
INSERT INTO `mydb`.`commodity` (`commodityID`, `store_storeID`, `cname`, `price`, `introduction`, `type`, `addedDate`, `picName`) VALUES ('8011', '1001', 'SAMICK Classic Piano P1', '17777', 'Piano', 'Classic', '2000-9-7', '111.jpeg');
INSERT INTO `mydb`.`commodity` (`commodityID`, `store_storeID`, `cname`, `price`, `introduction`, `type`, `addedDate`, `picName`) VALUES ('8012', '1002', 'Johannes Broadwood Classic Piano C12', '39999', 'Piano', 'Classic', '2004-4-1', '113.jpeg');
INSERT INTO `mydb`.`commodity` (`commodityID`, `store_storeID`, `cname`, `price`, `introduction`, `type`, `addedDate`, `picName`) VALUES ('8013', '1002', 'Johannes Broadwood Classic Piano C12', '3999', 'Piano', 'Classic', '2003-04-01', '114.jpeg');

