package com.lucfish.openapi.doudian.request.parameters;

import com.lucfish.openapi.doudian.domain.Spec;
import com.lucfish.openapi.doudian.utils.AssertUtils;
import com.lucfish.openapi.doudian.utils.CollectionUtils;
import com.lucfish.openapi.doudian.utils.Join;

import java.util.List;

public class SpecAddParameters {

    private String name;

    private String specs;

    public SpecAddParameters(Spec spec) {
        this.name = spec.getName();
        AssertUtils.isTrue(CollectionUtils.isPresent(spec.getSpecs()), "规格不可为空");
        List<Spec> specBeans = spec.getSpecs();
        AssertUtils.isTrue(specBeans.size() <= 3, "单次最多三组规格");

        String specs = specBeans.stream().map( child -> {
            if (CollectionUtils.isPresent(child.getValues())) {
                return child.getName() + "|" +
                        child.getValues().stream()
                                .map(Spec::getName).collect(Join.COMMA);
            }
            return child.getName() + "|" + child.getName();
        }).collect(Join.UPUP);

        this.specs = specs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }
}
