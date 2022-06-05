alter table website_detail change type type_id bigint not null comment '网站类型Id';

alter table website_detail modify icon varchar(50) null comment '网站图标' after status;

alter table website_detail add type_name varchar(100) null comment '网站类型名字' after type_id;