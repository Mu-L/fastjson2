## EishayParseBinary
| aliyun ecs spec | jdk version 	|	jsonb	|	fastjson2UTF8Bytes	|	hessian	|	javaSerialize |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.g8i.large | jdk1.8.0_371	|	4388.548	|	2607.037 (59.41%)	|	651.117 (14.84%)	|	116.236 (2.65%) |
| aliyun_ecs.g8i.large | jdk-11.0.19	|	5888.391	|	2625.466 (44.59%)	|	608.242 (10.33%)	|	114.515 (1.94%) |
| aliyun_ecs.g8i.large | jdk-17.0.7	|	6610.662	|	2814.33 (42.57%)	|	649.58 (9.83%)	|	129.094 (1.95%) |
| aliyun_ecs.g8y.large | jdk1.8.0_371	|	6231.432	|	3536.549 (56.75%)	|	369.073 (5.92%)	|	164.727 (2.64%) |
| aliyun_ecs.g8y.large | jdk-11.0.19	|	7420.278	|	4031.146 (54.33%)	|	439.279 (5.92%)	|	155.857 (2.1%) |
| aliyun_ecs.g8y.large | jdk-17.0.7	|	7879.108	|	4173.891 (52.97%)	|	386.303 (4.9%)	|	153.243 (1.94%) |

## EishayParseBinaryArrayMapping
| aliyun ecs spec | jdk version 	|	jsonb	|	kryo	|	protobuf	|	fastjson2UTF8Bytes |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.g8i.large | jdk1.8.0_371	|	7169.715	|	3481.625 (48.56%)	|	2679.206 (37.37%)	|	4390.307 (61.23%) |
| aliyun_ecs.g8i.large | jdk-11.0.19	|	9202.9	|	3382.647 (36.76%)	|	2780.809 (30.22%)	|	4538.169 (49.31%) |
| aliyun_ecs.g8i.large | jdk-17.0.7	|	11388.127	|	3386.003 (29.73%)	|	3734.042 (32.79%)	|	5112.19 (44.89%) |
| aliyun_ecs.g8y.large | jdk1.8.0_371	|	9903.285	|	4978.147 (50.27%)	|	3331.35 (33.64%)	|	5487.264 (55.41%) |
| aliyun_ecs.g8y.large | jdk-11.0.19	|	12008.923	|	5255.546 (43.76%)	|	3404.451 (28.35%)	|	6097.847 (50.78%) |
| aliyun_ecs.g8y.large | jdk-17.0.7	|	12024.691	|	5332.194 (44.34%)	|	4365.902 (36.31%)	|	5907.405 (49.13%) |

## EishayParseBinaryAutoType
| aliyun ecs spec | jdk version 	|	fastjson2JSONB	|	hessian	|	javaSerialize |
|-----|-----|----------|----------|-----|
| aliyun_ecs.g8i.large | jdk1.8.0_371	|	3707.536	|	661.04 (17.83%)	|	114.684 (3.09%) |
| aliyun_ecs.g8i.large | jdk-11.0.19	|	4448.55	|	612.755 (13.77%)	|	113.434 (2.55%) |
| aliyun_ecs.g8i.large | jdk-17.0.7	|	4927.612	|	667.588 (13.55%)	|	130.415 (2.65%) |
| aliyun_ecs.g8y.large | jdk1.8.0_371	|	5112.18	|	329.203 (6.44%)	|	158.141 (3.09%) |
| aliyun_ecs.g8y.large | jdk-11.0.19	|	5920.268	|	424.639 (7.17%)	|	155.664 (2.63%) |
| aliyun_ecs.g8y.large | jdk-17.0.7	|	6169.722	|	404.356 (6.55%)	|	158.7 (2.57%) |

## EishayParseString
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.g8i.large | jdk1.8.0_371	|	2870.573	|	2132.282 (74.28%)	|	1084.414 (37.78%)	|	1014.534 (35.34%) |
| aliyun_ecs.g8i.large | jdk-11.0.19	|	2652.108	|	1990.33 (75.05%)	|	1023.581 (38.59%)	|	1000.664 (37.73%) |
| aliyun_ecs.g8i.large | jdk-17.0.7	|	2862.956	|	2634.992 (92.04%)	|	999.619 (34.92%)	|	1019.517 (35.61%) |
| aliyun_ecs.g8y.large | jdk1.8.0_371	|	3898.545	|	3085.803 (79.15%)	|	1429.174 (36.66%)	|	1392.774 (35.73%) |
| aliyun_ecs.g8y.large | jdk-11.0.19	|	4107.464	|	3096.042 (75.38%)	|	1335.993 (32.53%)	|	1356.627 (33.03%) |
| aliyun_ecs.g8y.large | jdk-17.0.7	|	4063.624	|	4069.445 (100.14%)	|	1387.046 (34.13%)	|	1447.01 (35.61%) |

## EishayParseStringPretty
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.g8i.large | jdk1.8.0_371	|	1964.824	|	587.542 (29.9%)	|	989.114 (50.34%)	|	933.245 (47.5%) |
| aliyun_ecs.g8i.large | jdk-11.0.19	|	1897.385	|	566.281 (29.85%)	|	883.072 (46.54%)	|	914.616 (48.2%) |
| aliyun_ecs.g8i.large | jdk-17.0.7	|	1964.134	|	624.68 (31.8%)	|	878.167 (44.71%)	|	915.716 (46.62%) |
| aliyun_ecs.g8y.large | jdk1.8.0_371	|	3039.049	|	870.297 (28.64%)	|	1277.591 (42.04%)	|	1297.9 (42.71%) |
| aliyun_ecs.g8y.large | jdk-11.0.19	|	3010.517	|	900.369 (29.91%)	|	1224.688 (40.68%)	|	1309.676 (43.5%) |
| aliyun_ecs.g8y.large | jdk-17.0.7	|	2919.578	|	996.542 (34.13%)	|	1311.416 (44.92%)	|	1311.503 (44.92%) |

## EishayParseTreeString
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.g8i.large | jdk1.8.0_371	|	2168.082	|	1176.365 (54.26%)	|	1094.253 (50.47%)	|	862.905 (39.8%) |
| aliyun_ecs.g8i.large | jdk-11.0.19	|	2090.496	|	1044.124 (49.95%)	|	1013.746 (48.49%)	|	808.238 (38.66%) |
| aliyun_ecs.g8i.large | jdk-17.0.7	|	2358.12	|	1268.669 (53.8%)	|	1136.848 (48.21%)	|	811.063 (34.39%) |
| aliyun_ecs.g8y.large | jdk1.8.0_371	|	2480.759	|	1362.436 (54.92%)	|	1160.535 (46.78%)	|	1131.05 (45.59%) |
| aliyun_ecs.g8y.large | jdk-11.0.19	|	2361.859	|	1373.127 (58.14%)	|	1243.858 (52.66%)	|	1109.185 (46.96%) |
| aliyun_ecs.g8y.large | jdk-17.0.7	|	2818.208	|	1528.22 (54.23%)	|	1440.489 (51.11%)	|	1151.181 (40.85%) |

## EishayParseTreeStringPretty
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.g8i.large | jdk1.8.0_371	|	1628.688	|	999.884 (61.39%)	|	1047.133 (64.29%)	|	800.24 (49.13%) |
| aliyun_ecs.g8i.large | jdk-11.0.19	|	1544.849	|	882.444 (57.12%)	|	898.465 (58.16%)	|	738.097 (47.78%) |
| aliyun_ecs.g8i.large | jdk-17.0.7	|	1809.986	|	1088.753 (60.15%)	|	975.178 (53.88%)	|	749.679 (41.42%) |
| aliyun_ecs.g8y.large | jdk1.8.0_371	|	2193.657	|	1199.499 (54.68%)	|	1117.045 (50.92%)	|	1071.904 (48.86%) |
| aliyun_ecs.g8y.large | jdk-11.0.19	|	2372.609	|	1152.536 (48.58%)	|	1144.582 (48.24%)	|	1050.072 (44.26%) |
| aliyun_ecs.g8y.large | jdk-17.0.7	|	2347.049	|	1312.499 (55.92%)	|	1289.34 (54.93%)	|	1061.981 (45.25%) |

## EishayParseTreeUTF8Bytes
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.g8i.large | jdk1.8.0_371	|	2182.54	|	1028.046 (47.1%)	|	1217.184 (55.77%)	|	798.017 (36.56%) |
| aliyun_ecs.g8i.large | jdk-11.0.19	|	1983.949	|	908.863 (45.81%)	|	1192.195 (60.09%)	|	781.96 (39.41%) |
| aliyun_ecs.g8i.large | jdk-17.0.7	|	2395.587	|	1109.795 (46.33%)	|	1225.175 (51.14%)	|	778.052 (32.48%) |
| aliyun_ecs.g8y.large | jdk1.8.0_371	|	2432.561	|	1170.911 (48.13%)	|	1287.931 (52.95%)	|	1041.077 (42.8%) |
| aliyun_ecs.g8y.large | jdk-11.0.19	|	2786.325	|	1219.726 (43.78%)	|	1391.908 (49.95%)	|	1058.868 (38%) |
| aliyun_ecs.g8y.large | jdk-17.0.7	|	2821.123	|	1322.431 (46.88%)	|	1467.817 (52.03%)	|	1041.672 (36.92%) |

## EishayParseTreeUTF8BytesPretty
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.g8i.large | jdk1.8.0_371	|	1734.66	|	883.305 (50.92%)	|	1112.072 (64.11%)	|	743.831 (42.88%) |
| aliyun_ecs.g8i.large | jdk-11.0.19	|	1596.168	|	787.439 (49.33%)	|	1057.181 (66.23%)	|	733.364 (45.95%) |
| aliyun_ecs.g8i.large | jdk-17.0.7	|	1883.0	|	918.913 (48.8%)	|	1066.392 (56.63%)	|	742.795 (39.45%) |
| aliyun_ecs.g8y.large | jdk1.8.0_371	|	2157.303	|	979.276 (45.39%)	|	1223.407 (56.71%)	|	941.342 (43.64%) |
| aliyun_ecs.g8y.large | jdk-11.0.19	|	2332.198	|	1042.661 (44.71%)	|	1326.067 (56.86%)	|	1018.32 (43.66%) |
| aliyun_ecs.g8y.large | jdk-17.0.7	|	2318.403	|	1167.283 (50.35%)	|	1431.737 (61.76%)	|	1034.969 (44.64%) |

## EishayParseUTF8Bytes
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.g8i.large | jdk1.8.0_371	|	2645.662	|	1854.562 (70.1%)	|	1161.459 (43.9%)	|	843.379 (31.88%) |
| aliyun_ecs.g8i.large | jdk-11.0.19	|	2601.964	|	1683.511 (64.7%)	|	1076.441 (41.37%)	|	906.523 (34.84%) |
| aliyun_ecs.g8i.large | jdk-17.0.7	|	2861.489	|	2071.975 (72.41%)	|	1065.199 (37.23%)	|	991.413 (34.65%) |
| aliyun_ecs.g8y.large | jdk1.8.0_371	|	3572.894	|	2619.02 (73.3%)	|	1397.906 (39.13%)	|	1285.296 (35.97%) |
| aliyun_ecs.g8y.large | jdk-11.0.19	|	4027.649	|	2517.457 (62.5%)	|	1560.381 (38.74%)	|	1349.979 (33.52%) |
| aliyun_ecs.g8y.large | jdk-17.0.7	|	4146.829	|	3070.218 (74.04%)	|	1412.906 (34.07%)	|	1334.564 (32.18%) |

## EishayParseUTF8BytesPretty
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.g8i.large | jdk1.8.0_371	|	1926.891	|	554.088 (28.76%)	|	1034.305 (53.68%)	|	748.061 (38.82%) |
| aliyun_ecs.g8i.large | jdk-11.0.19	|	1939.343	|	537.031 (27.69%)	|	1008.207 (51.99%)	|	707.457 (36.48%) |
| aliyun_ecs.g8i.large | jdk-17.0.7	|	2074.753	|	582.48 (28.07%)	|	1004.287 (48.41%)	|	721.573 (34.78%) |
| aliyun_ecs.g8y.large | jdk1.8.0_371	|	2802.421	|	817.486 (29.17%)	|	1451.764 (51.8%)	|	951.421 (33.95%) |
| aliyun_ecs.g8y.large | jdk-11.0.19	|	3032.58	|	825.434 (27.22%)	|	1424.678 (46.98%)	|	1021.859 (33.7%) |
| aliyun_ecs.g8y.large | jdk-17.0.7	|	2994.642	|	886.915 (29.62%)	|	1399.199 (46.72%)	|	1041.451 (34.78%) |

## EishayWriteBinary
| aliyun ecs spec | jdk version 	|	jsonb	|	fastjson2UTF8Bytes	|	hessian	|	javaSerialize |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.g8i.large | jdk1.8.0_371	|	5176.155	|	3066.061 (59.23%)	|	890.63 (17.21%)	|	540.77 (10.45%) |
| aliyun_ecs.g8i.large | jdk-11.0.19	|	5042.003	|	3278.686 (65.03%)	|	838.814 (16.64%)	|	528.435 (10.48%) |
| aliyun_ecs.g8i.large | jdk-17.0.7	|	7540.108	|	4139.77 (54.9%)	|	818.017 (10.85%)	|	536.415 (7.11%) |
| aliyun_ecs.g8y.large | jdk1.8.0_371	|	7210.464	|	5011.592 (69.5%)	|	1172.33 (16.26%)	|	809.461 (11.23%) |
| aliyun_ecs.g8y.large | jdk-11.0.19	|	8997.134	|	5507.133 (61.21%)	|	994.698 (11.06%)	|	837.254 (9.31%) |
| aliyun_ecs.g8y.large | jdk-17.0.7	|	9447.465	|	5788.453 (61.27%)	|	1217.872 (12.89%)	|	770.077 (8.15%) |

## EishayWriteBinaryArrayMapping
| aliyun ecs spec | jdk version 	|	jsonb	|	kryo	|	protobuf	|	fastjson2UTF8Bytes |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.g8i.large | jdk1.8.0_371	|	9644.034	|	3354.45 (34.78%)	|	3171.639 (32.89%)	|	4012.576 (41.61%) |
| aliyun_ecs.g8i.large | jdk-11.0.19	|	11264.881	|	3696.024 (32.81%)	|	3147.663 (27.94%)	|	4631.611 (41.12%) |
| aliyun_ecs.g8i.large | jdk-17.0.7	|	14457.895	|	3885.388 (26.87%)	|	3768.828 (26.07%)	|	5107.681 (35.33%) |
| aliyun_ecs.g8y.large | jdk1.8.0_371	|	9287.403	|	5264.111 (56.68%)	|	3585.661 (38.61%)	|	6019.37 (64.81%) |
| aliyun_ecs.g8y.large | jdk-11.0.19	|	14858.326	|	5868.044 (39.49%)	|	5232.331 (35.21%)	|	7134.543 (48.02%) |
| aliyun_ecs.g8y.large | jdk-17.0.7	|	17426.106	|	4992.227 (28.65%)	|	4754.275 (27.28%)	|	7338.634 (42.11%) |

## EishayWriteBinaryAutoType
| aliyun ecs spec | jdk version 	|	fastjson2JSONB	|	hessian	|	javaSerialize |
|-----|-----|----------|----------|-----|
| aliyun_ecs.g8i.large | jdk1.8.0_371	|	3447.337	|	870.218 (25.24%)	|	525.212 (15.24%) |
| aliyun_ecs.g8i.large | jdk-11.0.19	|	3009.642	|	826.271 (27.45%)	|	500.528 (16.63%) |
| aliyun_ecs.g8i.large | jdk-17.0.7	|	3331.022	|	823.268 (24.72%)	|	542.734 (16.29%) |
| aliyun_ecs.g8y.large | jdk1.8.0_371	|	4511.066	|	1205.126 (26.71%)	|	805.164 (17.85%) |
| aliyun_ecs.g8y.large | jdk-11.0.19	|	4467.829	|	1010.388 (22.61%)	|	865.11 (19.36%) |
| aliyun_ecs.g8y.large | jdk-17.0.7	|	4684.471	|	1219.234 (26.03%)	|	799.818 (17.07%) |

## EishayWriteString
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.g8i.large | jdk1.8.0_371	|	3502.554	|	1532.289 (43.75%)	|	2169.385 (61.94%)	|	1046.781 (29.89%) |
| aliyun_ecs.g8i.large | jdk-11.0.19	|	3058.88	|	1417.763 (46.35%)	|	1964.33 (64.22%)	|	677.725 (22.16%) |
| aliyun_ecs.g8i.large | jdk-17.0.7	|	3643.669	|	1517.224 (41.64%)	|	2091.633 (57.4%)	|	708.635 (19.45%) |
| aliyun_ecs.g8y.large | jdk1.8.0_371	|	4562.509	|	2128.052 (46.64%)	|	2405.875 (52.73%)	|	1336.178 (29.29%) |
| aliyun_ecs.g8y.large | jdk-11.0.19	|	5036.738	|	2216.181 (44%)	|	2540.071 (50.43%)	|	1171.177 (23.25%) |
| aliyun_ecs.g8y.large | jdk-17.0.7	|	5183.393	|	1951.111 (37.64%)	|	2737.744 (52.82%)	|	832.871 (16.07%) |

## EishayWriteStringTree
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.g8i.large | jdk1.8.0_371	|	3399.54	|	1879.376 (55.28%)	|	2128.951 (62.62%)	|	1004.783 (29.56%) |
| aliyun_ecs.g8i.large | jdk-11.0.19	|	3121.257	|	1804.324 (57.81%)	|	1881.65 (60.29%)	|	801.113 (25.67%) |
| aliyun_ecs.g8i.large | jdk-17.0.7	|	3360.751	|	1839.233 (54.73%)	|	1719.956 (51.18%)	|	746.581 (22.21%) |
| aliyun_ecs.g8y.large | jdk1.8.0_371	|	3544.32	|	2256.29 (63.66%)	|	2599.511 (73.34%)	|	1737.19 (49.01%) |
| aliyun_ecs.g8y.large | jdk-11.0.19	|	4217.15	|	2369.653 (56.19%)	|	2552.307 (60.52%)	|	1367.281 (32.42%) |
| aliyun_ecs.g8y.large | jdk-17.0.7	|	4554.337	|	2470.236 (54.24%)	|	2519.874 (55.33%)	|	882.519 (19.38%) |

## EishayWriteUTF8Bytes
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.g8i.large | jdk1.8.0_371	|	3026.218	|	1419.287 (46.9%)	|	1955.805 (64.63%)	|	929.813 (30.73%) |
| aliyun_ecs.g8i.large | jdk-11.0.19	|	3242.358	|	1280.608 (39.5%)	|	1867.374 (57.59%)	|	729.989 (22.51%) |
| aliyun_ecs.g8i.large | jdk-17.0.7	|	4066.177	|	1335.5 (32.84%)	|	1985.303 (48.82%)	|	688.726 (16.94%) |
| aliyun_ecs.g8y.large | jdk1.8.0_371	|	5029.763	|	1944.928 (38.67%)	|	2516.181 (50.03%)	|	1246.339 (24.78%) |
| aliyun_ecs.g8y.large | jdk-11.0.19	|	5607.176	|	1962.061 (34.99%)	|	2431.034 (43.36%)	|	1243.0 (22.17%) |
| aliyun_ecs.g8y.large | jdk-17.0.7	|	5731.522	|	1957.402 (34.15%)	|	2552.703 (44.54%)	|	845.642 (14.75%) |

## EishayWriteUTF8BytesTree
| aliyun ecs spec | jdk version 	|	fastjson2	|	jackson |
|-----|-----|----------|-----|
| aliyun_ecs.g8i.large | jdk1.8.0_371	|	3704.565	|	2062.907 (55.69%) |
| aliyun_ecs.g8i.large | jdk-11.0.19	|	3137.769	|	1576.616 (50.25%) |
| aliyun_ecs.g8i.large | jdk-17.0.7	|	3391.555	|	1778.252 (52.43%) |
| aliyun_ecs.g8y.large | jdk1.8.0_371	|	4262.706	|	2705.739 (63.47%) |
| aliyun_ecs.g8y.large | jdk-11.0.19	|	4440.439	|	2313.671 (52.1%) |
| aliyun_ecs.g8y.large | jdk-17.0.7	|	4541.054	|	2568.585 (56.56%) |
