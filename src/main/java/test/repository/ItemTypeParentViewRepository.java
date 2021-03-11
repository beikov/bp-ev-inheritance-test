/*
 * Copyright 2014 - 2021 Blazebit.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package test.repository;

import com.blazebit.persistence.spring.data.repository.EntityViewRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import test.view.ItemTypeView;
import test.view.RefTypeParentView;

@Repository
@Transactional(readOnly = true)
public interface ItemTypeParentViewRepository extends EntityViewRepository<ItemTypeView<RefTypeParentView>, Integer> {
}