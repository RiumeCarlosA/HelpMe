CREATE TABLE IF NOT EXISTS public.perfis
(
    pessoa_id integer NOT NULL,
    perfis integer,
    CONSTRAINT fklnesgnyiynjyqx8ks8cyhv6il FOREIGN KEY (pessoa_id)
        REFERENCES public.pessoa (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)