PGDMP     8                
    {            AMS    10.23    10.23                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                       false                       1262    16400    AMS    DATABASE     �   CREATE DATABASE "AMS" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Spanish_Spain.1252' LC_CTYPE = 'Spanish_Spain.1252';
    DROP DATABASE "AMS";
          
   TlapaAdmin    false                       0    0    DATABASE "AMS"    COMMENT     e   COMMENT ON DATABASE "AMS" IS 'Base de datos para la materia de analisis y modelamiento de software';
               
   TlapaAdmin    false    2832                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
             postgres    false                       0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                  postgres    false    3                        3079    12924    plpgsql 	   EXTENSION     ?   CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;
    DROP EXTENSION plpgsql;
                  false                       0    0    EXTENSION plpgsql    COMMENT     @   COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';
                       false    1            �            1259    16416    alerta_pedidos    TABLE     �   CREATE TABLE public.alerta_pedidos (
    id_alerta character varying(10) NOT NULL,
    id_producto character varying(10) NOT NULL,
    cantidad_pedido integer NOT NULL,
    id_proveedor character varying(10) NOT NULL
);
 "   DROP TABLE public.alerta_pedidos;
       public      
   TlapaAdmin    false    3            �            1259    16421    control_cantidades    TABLE     �   CREATE TABLE public.control_cantidades (
    id_producto character varying(10) NOT NULL,
    cantidad_minima integer NOT NULL,
    cantidad_pedido integer NOT NULL
);
 &   DROP TABLE public.control_cantidades;
       public      
   TlapaAdmin    false    3            �            1259    16426    dias_reparto    TABLE     (  CREATE TABLE public.dias_reparto (
    id_dias_reparto character varying(10) NOT NULL,
    lunes boolean NOT NULL,
    martes boolean NOT NULL,
    miercoles boolean NOT NULL,
    jueves boolean NOT NULL,
    viernes boolean NOT NULL,
    sabado boolean NOT NULL,
    domingo boolean NOT NULL
);
     DROP TABLE public.dias_reparto;
       public      
   TlapaAdmin    false    3            �            1259    16450 
   inventario    TABLE     [  CREATE TABLE public.inventario (
    id_producto character varying(10) NOT NULL,
    nombre_producto character varying(50) NOT NULL,
    descripcion character varying(75) NOT NULL,
    precio_publico real NOT NULL,
    id_proveedor character varying(10) NOT NULL,
    cantidad_en_inventario integer NOT NULL,
    precio_proveedor real NOT NULL
);
    DROP TABLE public.inventario;
       public      
   TlapaAdmin    false    3            �            1259    16406 	   proveedor    TABLE       CREATE TABLE public.proveedor (
    id_proveedor character varying(10) NOT NULL,
    nombre_proveedor character varying(75) NOT NULL,
    telefono character varying(13) NOT NULL,
    correo character varying(20),
    id_dias_reparto character varying(10) NOT NULL
);
    DROP TABLE public.proveedor;
       public      
   TlapaAdmin    false    3            �            1259    16411    ventas    TABLE     �   CREATE TABLE public.ventas (
    id_venta character varying(10) NOT NULL,
    fecha date NOT NULL,
    total_venta real NOT NULL
);
    DROP TABLE public.ventas;
       public      
   TlapaAdmin    false    3                      0    16416    alerta_pedidos 
   TABLE DATA               _   COPY public.alerta_pedidos (id_alerta, id_producto, cantidad_pedido, id_proveedor) FROM stdin;
    public    
   TlapaAdmin    false    198   �                 0    16421    control_cantidades 
   TABLE DATA               [   COPY public.control_cantidades (id_producto, cantidad_minima, cantidad_pedido) FROM stdin;
    public    
   TlapaAdmin    false    199          	          0    16426    dias_reparto 
   TABLE DATA               s   COPY public.dias_reparto (id_dias_reparto, lunes, martes, miercoles, jueves, viernes, sabado, domingo) FROM stdin;
    public    
   TlapaAdmin    false    200   J       
          0    16450 
   inventario 
   TABLE DATA               �   COPY public.inventario (id_producto, nombre_producto, descripcion, precio_publico, id_proveedor, cantidad_en_inventario, precio_proveedor) FROM stdin;
    public    
   TlapaAdmin    false    201   g                 0    16406 	   proveedor 
   TABLE DATA               f   COPY public.proveedor (id_proveedor, nombre_proveedor, telefono, correo, id_dias_reparto) FROM stdin;
    public    
   TlapaAdmin    false    196   �                 0    16411    ventas 
   TABLE DATA               >   COPY public.ventas (id_venta, fecha, total_venta) FROM stdin;
    public    
   TlapaAdmin    false    197   �       �
           2606    16420 "   alerta_pedidos Alerta_pedidos_pkey 
   CONSTRAINT     i   ALTER TABLE ONLY public.alerta_pedidos
    ADD CONSTRAINT "Alerta_pedidos_pkey" PRIMARY KEY (id_alerta);
 N   ALTER TABLE ONLY public.alerta_pedidos DROP CONSTRAINT "Alerta_pedidos_pkey";
       public      
   TlapaAdmin    false    198            �
           2606    16425 *   control_cantidades Control_cantidades_pkey 
   CONSTRAINT     s   ALTER TABLE ONLY public.control_cantidades
    ADD CONSTRAINT "Control_cantidades_pkey" PRIMARY KEY (id_producto);
 V   ALTER TABLE ONLY public.control_cantidades DROP CONSTRAINT "Control_cantidades_pkey";
       public      
   TlapaAdmin    false    199            �
           2606    16430    dias_reparto Dias_reparto_pkey 
   CONSTRAINT     k   ALTER TABLE ONLY public.dias_reparto
    ADD CONSTRAINT "Dias_reparto_pkey" PRIMARY KEY (id_dias_reparto);
 J   ALTER TABLE ONLY public.dias_reparto DROP CONSTRAINT "Dias_reparto_pkey";
       public      
   TlapaAdmin    false    200            �
           2606    16410    proveedor Proveedor_pkey 
   CONSTRAINT     b   ALTER TABLE ONLY public.proveedor
    ADD CONSTRAINT "Proveedor_pkey" PRIMARY KEY (id_proveedor);
 D   ALTER TABLE ONLY public.proveedor DROP CONSTRAINT "Proveedor_pkey";
       public      
   TlapaAdmin    false    196            �
           2606    16415    ventas Ventas_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY public.ventas
    ADD CONSTRAINT "Ventas_pkey" PRIMARY KEY (id_venta);
 >   ALTER TABLE ONLY public.ventas DROP CONSTRAINT "Ventas_pkey";
       public      
   TlapaAdmin    false    197            �
           2606    16454    inventario inventario_pkey 
   CONSTRAINT     a   ALTER TABLE ONLY public.inventario
    ADD CONSTRAINT inventario_pkey PRIMARY KEY (id_producto);
 D   ALTER TABLE ONLY public.inventario DROP CONSTRAINT inventario_pkey;
       public      
   TlapaAdmin    false    201                  x������ � �         !   x�H�7�44 "���x#NC 2����� T�$      	      x������ � �      
   P   x�H�7�,�/����ɇ3ʋ9��L9�����F\)�F���)�E��!E�9��
ũy�`m�F�FƜ�F\1z\\\ �sG            x������ � �            x������ � �     