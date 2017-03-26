DROP DATABASE erp;
CREATE DATABASE erp;
USE erp;

-- 거래회사
-- clnt_code, clnt_name, clnt_addr, clnt_tel, clnt_isleave
CREATE TABLE client (
	clnt_code    VARCHAR(6)  NOT NULL, 
	clnt_name    VARCHAR(20) NOT NULL,
	clnt_addr    VARCHAR(50) NULL,
	clnt_tel     VARCHAR(15) NULL,
	clnt_isleave BOOLEAN     NOT NULL,
	PRIMARY KEY (clnt_code)
);

-- 공급회사
-- comp_code, comp_name, comp_addr, comp_tel, comp_isleave
CREATE TABLE supply_company (
	comp_code    VARCHAR(6)  NOT NULL,
	comp_name    VARCHAR(20) NOT NULL,
	comp_addr    VARCHAR(50) NULL,
	comp_tel     VARCHAR(15) NULL,
	comp_isleave BOOLEAN     NOT NULL,
	PRIMARY KEY (comp_code)
);

-- 분류
-- group_code, group_name
CREATE TABLE category (
	group_code VARCHAR(6)  NOT NULL,   
	group_name VARCHAR(20) NOT NULL,
	PRIMARY KEY (group_code)
);

-- 소프트웨어
-- sw_code, group_code, sw_name, sale_price, sw_inven, sw_issale  
CREATE TABLE software (
	sw_code    VARCHAR(6)  NOT NULL,
	group_code VARCHAR(6)  NOT NULL,
	sw_name    VARCHAR(50) NOT NULL,
	sale_price INTEGER     NOT NULL,
	sw_inven   INTEGER     NOT NULL,
	sw_issale  BOOLEAN     NOT NULL,
	PRIMARY KEY (sw_code),
	FOREIGN KEY (group_code) 
		REFERENCES category(group_code)
		ON UPDATE CASCADE
);

-- 납품
-- del_code, comp_code, sw_code, supply_price, supply_amount, order_date, del_isdelete
CREATE TABLE delivery (
	del_code 	  VARCHAR(6) NOT NULL,
	comp_code 	  VARCHAR(6) NOT NULL,
	sw_code   	  VARCHAR(6) NOT NULL,
	supply_price  INTEGER  	 NOT NULL,
	supply_amount INTEGER	 NOT NULL,
	order_date 	  DATE       NOT NULL, 
	del_isdelete  BOOLEAN	 NOT NULL,
	PRIMARY KEY (del_code),
	FOREIGN KEY (comp_code) 
		REFERENCES supply_company (comp_code)
		ON UPDATE CASCADE,
	FOREIGN KEY (sw_code)   
		REFERENCES software (sw_code)
		ON UPDATE CASCADE
);

-- 거래내역
-- sale_code, clnt_code, sw_code, sale_amount, isdeposit, order_date, supply_price, sale_price, sale_delete
CREATE TABLE sale (
	sale_code    VARCHAR(6) NOT NULL,
	clnt_code    VARCHAR(6) NOT NULL,
	sw_code      VARCHAR(6) NOT NULL,
	sale_amount  INTEGER    NOT NULL,
	isdeposit    BOOLEAN    NOT NULL,
	order_date   DATE       NOT NULL,
	supply_price INTEGER    NOT NULL,
	sale_price   INTEGER    NOT NULL, 
	sale_delete  BOOLEAN    NOT NULL,
	PRIMARY KEY (sale_code),
	FOREIGN KEY (clnt_code) 
		REFERENCES client (clnt_code)
		ON UPDATE CASCADE,
	FOREIGN KEY (sw_code) 
		REFERENCES software (sw_code)
		ON UPDATE CASCADE
);

DROP TABLE sale;
DROP TABLE delivery;
DROP TABLE software;
DROP TABLE category;
DROP TABLE supply_company;
DROP TABLE client;

-- 거래회사 샘플데이터 입력
INSERT INTO client(clnt_code, clnt_name, clnt_addr, clnt_tel, clnt_isleave) VALUES
	("CL001", "재밌는 게임방",	   "서울시 동대문구 연희동",  "02-111-1111", TRUE),
	("CL002", "좋은 게임방",       "서울시 관악구 봉천동",    "02-222-2222", FALSE),
	("CL003", "친구 게임방",	   "천안시 동남구 신부동",    "041-333-3333",FALSE),
	("CL004", "충청남도 교육청",   "대전광역시 중구 과례2길", "042-444-4444",FALSE),
	("CL005", "대전광역시 교육청", "대전광역시 서구 향촌길",  "042-555-5555",FALSE),
	("CL006", "아산시스템",		   "충청남도 아산시 배방면",  "041-777-7777",FALSE);

-- 공급회사 샘플데이터 입력
INSERT INTO supply_company(comp_code, comp_name, comp_addr, comp_tel, comp_isleave) VALUES
	("SC001", "알럽소프트",   "경기도 부천시 계산동",            "02-930-4551", TRUE),
	("SC002", "인디넷",       "경기도 수원시 제포동",            "032-579-4512",FALSE),
	("SC003", "참빛소프트",   "경기도 파주군 은빛아파트",        "032-501-4503",FALSE),
	("SC004", "소프트마켓",   "서울특별시 관진구 자양동",        "02-802-4564", FALSE),
	("SC005", "크라이스",     "경기도 고양시 대자동 서영아파트", "032-659-3215",FALSE),
	("SC006", "프로그램캠프", "경기도 부천시 오정구",            "032-659-3215",TRUE);

-- 분류 입력
INSERT INTO category(group_code, group_name) VALUES
	("GR001", "게임"),
	("GR002", "사무"),
	("GR003", "그래픽"),
	("GR004", "교육");

-- 소프트웨어 샘플데이터 입력
INSERT INTO software(sw_code,group_code,sw_name,sale_price,sw_inven,sw_issale) VALUES
	("SW001","GR001", "바람의제국", 40000,   2000,  TRUE),
	("SW002","GR002", "국제무역", 	48000,   500,   FALSE),
	("SW003","GR003", "FIFA2015",	40500, 	 1000 , FALSE),
	("SW004","GR004", "삼국지",		48000, 	 400,   FALSE),
	("SW005","GR001", "아마겟돈",	50750, 	 1000,  FALSE),
	("SW006","GR002", "한컴오피스",	1918000, 2000,  FALSE),
	("SW007","GR003", "포토샵",		1519000, 400,   FALSE),
	("SW008","GR004", "오토캐드",	978000,	 2,	    FALSE),
	("SW009","GR001", "인디자인", 	218040,	 4000,  FALSE),
	("SW010","GR002", "windows10",	333450,	 40000, TRUE);
 
-- 납품현황입력
INSERT INTO delivery(del_code, comp_code, sw_code, supply_price, supply_amount, order_date, del_isdelete) VALUES
	("DL001", "SC001", "SW001", 20000, 100, now(), TRUE),
	("DL002", "SC002", "SW002", 30000, 200, now(), FALSE),
	("DL003", "SC003", "SW003", 30000, 100, now(), FALSE),
	("DL004", "SC004", "SW004", 17000, 150, now(), FALSE),
	("DL005", "SC005", "SW005", 25000, 200, now(), TRUE),
	("DL006", "SC006", "SW006", 2000,  100, now(), FALSE),
	("DL007", "SC001", "SW007", 5000,  200, now(), FALSE),
	("DL008", "SC002", "SW008", 30000, 100, now(), FALSE),
	("DL009", "SC003", "SW009", 17000, 150, now(), FALSE),
	("DL010", "SC004", "SW010", 25000, 200, now(), FALSE),
	("DL011", "SC001", "SW001", 25000, 200, now(), TRUE);

-- 거래내역 샘플데이터 입력
INSERT INTO sale(sale_code, clnt_code, sw_code, sale_amount, 
				isdeposit, order_date, supply_price, sale_price, sale_delete) VALUES  
	("SL001","CL001","SW001",25, TRUE, "2009-12-13", 25000  , 40000,   TRUE),
	("SL002","CL003","SW002",25, TRUE, "2010-09-13", 30000  , 48000,   FALSE),
	("SL003","CL002","SW003",20, TRUE, "2010-09-11", 27000  , 40500,   FALSE),
	("SL004","CL001","SW004",25, TRUE, "2010-10-02", 32000  , 48000,   FALSE),
	("SL005","CL004","SW005",250,FALSE,"2010-10-02", 35000  , 50750,   FALSE),
	("SL006","CL006","SW006",2,  FALSE,"2010-10-02", 1370000, 1918000, TRUE),
	("SL007","CL003","SW007",20, TRUE, "2010-10-04", 25000  , 40000,   FALSE),
	("SL008","CL005","SW008",20, TRUE, "2010-10-04", 30000  , 48000,   FALSE),
	("SL009","CL006","SW009",2,  TRUE, "2010-10-04", 32000  , 48000,   FALSE),
	("SL010","CL004","SW010",320,TRUE, "2010-10-04", 980000 , 1519000, FALSE),
	("SL011","CL004","SW001",100,TRUE, "2010-10-04", 25000  , 40000,   TRUE);

SELECT * FROM client;
SELECT * FROM sale;
SELECT * FROM delivery;
SELECT * FROM software;
SELECT * FROM supply_company;
SELECT * FROM category;


#############################################     CRUD    ###################################################

-- 전체검색
SELECT clnt_code,clnt_name,clnt_addr,clnt_tel FROM client;

-- 번호검색
SELECT clnt_code,clnt_name,clnt_addr,clnt_tel FROM client WHERE clnt_code="CL001";
-- SELECT clnt_code,clnt_name,clnt_addr,clnt_tel FROM client WHERE clnt_code=#{clntNo};

-- 입력
INSERT INTO client VALUES ("CL999", "테스트 게임방", "서울시 동대문구 연희동", "02-111-1111", TRUE);
-- INSERT INTO client VALUES (#{clntNo},#{clntName},#{clntAddr},#{clntTel},#{true});

-- 수정
UPDATE client SET clnt_name=#{clntName} ,clnt_addr={clntAddr},clnt_tel= #{clntTel} 
	WHERE clnt_code="CL999";
UPDATE client SET clnt_name=#{clntName} ,clnt_addr={clntAddr},clnt_tel= #{clntTel} 
	WHERE clnt_code=#{clntNo};

-- 삭제
UPDATE client SET clnt_isleave=FALSE WHERE clnt_code=#{clntNo};



//공급회사

-- 전체검색
select comp_code,comp_name,comp_addr,comp_tel from supply_company;

--번호검색
select  comp_code,comp_name,comp_addr,comp_tel from supply_company where comp_code=#{compCode};

--입력
INSERT INTO supply_company values (#{compCode},#{compName},#{compAddr},#{compTel},#{true});

--수정
update supply_company set comp_name=#{compName} ,comp_addr={compAddr},comp_tel= #{compTel} where comp_no=#{compCode};

--삭제
update supply_company set comp_isleave=false where comp_code=#{compCode};


//분류

--전체검색
select group_code,group_name from category;

--번호검색
select group_code,group_name from category where group_code=#{groupCode};

--입력
insert into category values(#{groupCode},#{groupName});

--수정
update category set group_name=#{groupName} where group_code=#{groupCode};

--삭제
delete from category where group_code=#{groupCode};


//소프트웨어

--전체검색
select sw_code,group_code,sw_name,sale_price,sw_inven from software;

--번호검색
select sw_code,group_code,sw_name,sale_price,sw_inven from software where sw_code=#{swCode};

--입력
INSERT INTO software(sw_code,group_code,sw_name,sale_price,sw_issale) VALUES(#{swCode},#{groupCode},#{swName},#{salePrice},#{true});

--수정
update software set group_code=#{groupCode},sw_name=#{swName},sale_price=#{salePrice},sw_issale=#{swIssale} where sw_code=#{swCode};

--판매중지
update software set sw_issale=#{swIssale} where sw_code=#{swCode};

// 납품

-- 전체검색
select del_code,comp_code,sw_code,sw_code,supply_price,supply_amount,order_date from delivery;

-- 번호검색
select del_code,comp_code,sw_code,sw_code,supply_price,supply_amount,order_date from delivery where del_code=#{delNo};

-- 입력
insert into delivery values(#{delNo},#{compCode},#{swCode},#{supplyPrice},#{supplyAmount},#{orderDate},#{true});

-- 삭제(수정구현안함 오기입시 삭제후 재입력, 삭제되더라도 리스트에 출력 비고란에 취소됨출력)
update delivery set=#{delIsdelete} where del_code=#{delNo}

** 추후 admin권한에 업데이트 구현여부 고민중

//판매

-- 전체검색
select sale_code, clnt_code,sw_code, sale_amount, supply_price, sale_price, isdeposit ,order_date from sale;

-- 번호검색
select sale_code, clnt_code,sw_code, sale_amount, supply_price, sale_price, isdeposit ,order_date from sale where sale_code=#{saleNo};

--입력
INSERT INTO sale VALUES (#{saleNo},#{clntNo},#{swCode},#{saleAmount},#{true},#{orderDate},#{supplyPrice},#{salePrice},#{true});

--삭제(수정구현안함 오기입시 삭제후 재입력, 삭제되더라도 리스트에 출력 비고란에 취소됨출력)
update sale set sale_delete= #{saleDelete} where sale_code=#{saleNo};

--수정

** 추후 admin권한에 업데이트 구현여부 고민중

// 고객별 판매현황조회

고객상호명 품목명 주문수량 입금여부 판매가격 매출금 미수금

select cl.clnt_name,sw.sw_name,s.sale_amount,s.isdeposit,sw.sale_price,
    @salePrice := s.sale_amount*sw.sale_price salePrice, 
    @receivable := @salePrice*!s.isDeposit receivablePrice
from client cl join sale s on cl.clnt_code= s.clnt_code join software sw on s.sw_code= sw.sw_code
where cl.clnt_name=#{clntName};

// 소프트웨어별 판매현황조회

품목명 분류 공급회사명 공급금액 판매금액 판매이윤

select sw.sw_name, ca.group_name , su.comp_name,
	@total_supply_price := sum(s.sale_amount* dv.supply_price ) total_supply_price,
	@total_price := sum(s.sale_amount * sw.sale_price ) total_price,
	@margin := sum(s.sale_amount * sw.sale_price -  s.sale_amount* dv.supply_price) margin
from software sw join  category ca on sw.group_code= ca.group_code join delivery dv on sw.sw_code=dv.sw_code join supply_company su on su.comp_code= dv.comp_code  join sale s on s.sw_code= sw.sw_code
where sw.sw_name =#{swname};

// 날짜별 판매현황조회

날짜 주문번호  상호 품명 수량 입금여부 

select s.order_date, s.sale_code ,cl.clnt_name,sw.sw_name,s.sale_amount,s.isdeposit
from sale s join client cl on s.clnt_code= cl.clnt_code join software sw on s.sw_code= sw.sw_code
where s.order_date between #{date} and #{date}
order by s.sale_code;

// 카테고리별 판매현황조회

그룹이름 총판매가격 총판매수량

select c.group_name ,
   @c_salePrice := sum(s.sale_amount*sw.sale_price) c_salePrice, 
   @c_amount := sum(s.sale_amount) c_amount
from category c join software sw on c.group_code= sw.group_code join sale s on sw.sw_code=s.sw_code
group by c.group_name;


// sw 전체판매현황 보고서
 
 날짜 분류 품목명 주문번호 주문수량 판매금액
 
select s.order_date , c.group_name ,sw.sw_name,s.sale_code ,sale_amount,
		@t_sale_price := sw.sale_price* s.sale_amount t_sale_price
from sale s join software sw on s.sw_code=sw.sw_code join category c on sw.group_code= c.group_code
order by s.order_date desc;


총합계

select 	@t_sale_price := sum(sw.sale_price* s.sale_amount) t_sale_price
from sale s join software sw on s.sw_code=sw.sw_code join category c on sw.group_code= c.group_code;


//거래명세서

공급회사명 날짜 고객명 품명 단가 주문수량 금액 세금 총납품금액

select su.comp_name , s.order_date , c.clnt_name ,  sw.sw_name , sw.sale_price ,s.sale_amount,
	 @g_saleprice := sw.sale_price* s.sale_amount g_sale_price,
	 @tex := @g_saleprice * 0.1 tex,
	 @tex_saleprice := @tex + @g_saleprice tex_saleprice
from supply_company su join delivery dl on su.comp_code= dl.comp_code join software sw on dl.sw_code= sw.sw_code join sale s on sw.sw_code= s.sw_code join client c on s.clnt_code=c.clnt_code ;

총납품금액 합계

select  @tex_saleprice := sum((sw.sale_price* s.sale_amount))*1.1 tex_saleprice
from supply_company su join delivery dl on su.comp_code= dl.comp_code join software sw on dl.sw_code= sw.sw_code join sale s on sw.sw_code= s.sw_code join client c on s.clnt_code=c.clnt_code ;

// 그래프출력

--주문현황 (고객이름 , 고객별 총주문갯수)
select c.clnt_name, sum(sale_amount) from sale s join client c on s.clnt_code=c.clnt_code
group by c.clnt_name;