# MTR London Underground Addon

A London Underground Addon for the [Minecraft Transit Railway](https://github.com/jonafanho/Minecraft-Transit-Railway) mod (original author: t1NbLu3).

Adds London Underground themed content (stations, trains, decorations) as an MTR addon.

Upstream project historically published as “The Tube” / London Underground addon on Modrinth.

---

## RongMC · Minecraft 26.3 Fabric 移植说明

本仓库是 RongMC 维护的 **Minecraft 26.3 / Fabric / Java 25** 移植构建，不是上游官方发行渠道。

### 与原版的主要差异
- Minecraft 26.3 Fabric 移植；Fabric id `rongmc_londonunderground`（provides `londonunderground`）。
- 依赖 `rongmc_mtr`。资源体积大（列车/站台模型）。

### 已知问题 / 限制
- 上游仓库缺少完整 README；本说明按 fabric.mod.json 与移植实践整理。
- 大资源包可能导致客户端显存与加载时间上升。
- 与其它 MTR 列车资源包冲突时，优先检查模型/音效覆盖。

### 构建与安装
- Fabric mod id：`rongmc_londonunderground`（`provides`：`londonunderground`，旧依赖名一般仍可解析）
- Release 产物见本仓库 Releases（jar 名带 `rongmc-` 前缀）
- 许可证：本仓以 **GPL-3.0** 发布（见 `LICENSE`）；请同时尊重上游原作者条款与署名

