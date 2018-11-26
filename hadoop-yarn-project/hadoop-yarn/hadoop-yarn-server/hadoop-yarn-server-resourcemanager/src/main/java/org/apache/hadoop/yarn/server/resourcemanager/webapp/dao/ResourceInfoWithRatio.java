package org.apache.hadoop.yarn.server.resourcemanager.webapp.dao;

import org.apache.hadoop.yarn.api.records.Resource;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ResourceInfoWithRatio {
    int memory;
    int vCores;
    float usedMemoryRatio;
    float usedVirtualCoresRatio;

    public ResourceInfoWithRatio() {
    }

    public ResourceInfoWithRatio(Resource res, float usedMemoryRatio, float usedVirtualCoresRatio) {
        memory = res.getMemory();
        vCores = res.getVirtualCores();
        this.usedMemoryRatio = usedMemoryRatio;
        this.usedVirtualCoresRatio = usedVirtualCoresRatio;
    }

    public int getMemory() {
        return memory;
    }

    public int getvCores() {
        return vCores;
    }

    public float getUsedMemoryRatio() {
        return usedMemoryRatio;
    }

    public float getUsedVirtualCoresRatio() {
        return usedVirtualCoresRatio;
    }

    @Override
    public String toString() {
        return "<memory:" + memory + " (" + (int) usedMemoryRatio * 100 + "), vCores:" + vCores + " (" + (int) usedVirtualCoresRatio * 100 + ")>";
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setvCores(int vCores) {
        this.vCores = vCores;
    }

    public void setUsedMemoryRatio(float usedMemoryRatio) {
        this.usedMemoryRatio = usedMemoryRatio;
    }

    public void setUsedVirtualCoresRatio(float usedVirtualCoresRatio) {
        this.usedVirtualCoresRatio = usedVirtualCoresRatio;
    }
}
