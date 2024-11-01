package Back._config.Enums;

import lombok.Getter;

@Getter
public enum ResourceType {
    // aqui são os enums
    LESSON_ONLY(0,"LESSON_ONLY"),
    LESSON_TASK(1,"LESSON_TASK"),
    FORUM(2,"FORUM"),
    EXTERNAL_LINK(3,"EXTERNAL_LINK");

    //aqui as instancias
    private final Integer codigo;
    private final String descricao;

    //aqui construtor
    ResourceType(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    //aqui um codigo para verificar se existe ou não de enum
    //se existir retorna ele se não retorna uma exceção (não necessario)
    public static ResourceType toEnum(Integer cod){
        if( cod == null){
            return null;
        }
        for(ResourceType x : ResourceType.values()){
            if(cod.equals(x.getCodigo())){
                return x;
            }
        }
        throw new IllegalArgumentException("ResourceType inválido: " + cod);
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}
